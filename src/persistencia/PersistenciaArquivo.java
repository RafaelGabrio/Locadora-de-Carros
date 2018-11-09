package persistencia;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class PersistenciaArquivo implements Persistencia{
    
    protected ObjectOutputStream objOutput;
    protected ObjectInputStream objInput;
    protected ArrayList<Object> objetos;

    @Override
    public Object ler(String caminho) throws IOException {
        try {
            File file = new File(caminho);
            objInput = new ObjectInputStream(new FileInputStream(file));
            ArrayList<Object> objs = (ArrayList<Object>) objInput.readObject();
            return objs;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    @Override
    public void salvar(Object objeto, String caminho) throws IOException {
        try {
            File file = new File(caminho);
            if (file.exists()) {
                ArrayList<Object> objs = (ArrayList<Object>) this.ler(caminho);
                objOutput = new ObjectOutputStream(new FileOutputStream(file));
                objs.add(objeto);
                objOutput.writeObject(objs);
                objOutput.close();
            } else {
                objOutput = new ObjectOutputStream(new FileOutputStream(file));
                ArrayList<Object> objs = new ArrayList<Object>();
                objs.add(objeto);
                objOutput.writeObject(objs);
                objOutput.close();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
