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
import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class PersistenciaArquivo implements Persistencia{
    
    protected ObjectOutputStream objOutput;
    protected ObjectInputStream objInput;
    
    @Override
    public void salvar(Object objeto) throws IOException {
        /*BufferedWriter buffWrite = new BufferedWriter(new FileWriter(caminho));
        buffWrite.append(objeto+"\n");
        buffWrite.close();
        */
        try{
            objOutput.writeObject(objeto);
            objOutput.close();
        } catch(IOException ex1){
            throw new IOException(ex1.getMessage());
        }
    }

    @Override
    public List<Object> ler(String caminho) throws IOException {
        /*BufferedReader buffRead = new BufferedReader(new FileReader(caminho));
        Object linha = (Object)buffRead.readLine().getClass();
        buffRead.close();*/
        List<Object> objetos = new ArrayList<Object>();
        this.criar(caminho);
        try {
            //objInput = new ObjectInputStream(new FileInputStream(caminho));
            while (true) {
                objetos.add((Object) objInput.readObject());
                objInput.close();
                JOptionPane.showMessageDialog(null, objetos);

            }       
        } catch (EOFException ex) {
            // fim da leitura aqui
        } catch (Exception ex) {
            ex.printStackTrace();
        }
     return objetos;
    }

    @Override
    public void criar(String caminho) throws IOException{
        File file = new File(caminho);
        if (file.exists()) {
            objInput = new ObjectInputStream(new FileInputStream(file));
        }
        objOutput = new ObjectOutputStream(new FileOutputStream(file, true));
    }
}  