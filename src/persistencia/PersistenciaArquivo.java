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

    /*@Override
    public ArrayList<Object> ler(String caminho) throws IOException {
        ArrayList<Object> objs = null;
        try {
            File file = new File(caminho);
            objInput = new ObjectInputStream(new FileInputStream(file));
            objs = (ArrayList<Object>) objInput.readObject();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return objs;
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
    }*/

    @Override
    public ArrayList<Object> ler(String caminho) throws IOException {
        ArrayList<Object> lista = new ArrayList();
        try {
            File arq = new File(caminho);
            objInput = new ObjectInputStream(new FileInputStream(arq));
            lista = (ArrayList<Object>)objInput.readObject();
            objInput.close();
        } catch(IOException erro1) {
            System.out.printf("Erro: %s", erro1.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }

        return(lista);
    }

    @Override
    public void salvar(Object objeto, String caminho) throws IOException {
        /*ArrayList<Object> objsS = new ArrayList();
        boolean a = this.criar(caminho);
        try{
            if (a){
                objsS = objetos;
                objsS.add(objeto);
                objOutput.writeObject(objsS);
                objOutput.close();
            }
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }*/
        ArrayList<Object> lista = new ArrayList();
        lista = this.ler(caminho);
        File arq = new File(caminho);
        try {
          //arq.delete();
          arq.createNewFile();

          ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arq));
          lista.add(objeto);
          objOutput.writeObject(lista);
          objOutput.close();

        } catch(IOException erro) {
            System.out.printf("Erro: %s", erro.getMessage());
        }
    }

    
    /*public boolean criar(String caminho) throws IOException {
        File arquivo = new File(caminho);
        try {
            if (arquivo.exists()){
                objOutput = new ObjectOutputStream(new FileOutputStream(arquivo));
                //System.out.println(caminho);
                objetos = this.ler(caminho);
                return true;
            } else {
                objOutput = new ObjectOutputStream(new FileOutputStream(arquivo));
                objetos = new ArrayList();
                return true;
            }
        } catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return false;
    }*/
   
}
