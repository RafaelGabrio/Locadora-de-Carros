package persistencia;

import classes.PessoaJuridica;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
            System.out.println(ex1.getMessage());
        }
    }

    @Override
    public Object ler(String caminho) throws IOException {
        /*BufferedReader buffRead = new BufferedReader(new FileReader(caminho));
        Object linha = (Object)buffRead.readLine().getClass();
        buffRead.close();*/
        Object linha = null;
        try {
        File arquivo = new File(caminho);
        if (arquivo.exists()) {
            objInput = new ObjectInputStream(new FileInputStream(arquivo)); 
            linha = (Object)objInput.readObject();
        }
      } catch(IOException erro1) {
          System.out.printf("Erro: %s", erro1.getMessage());
      } catch(ClassNotFoundException erro2) {
          System.out.printf("Erro: %s", erro2.getMessage());
      }
        
        return linha;
    }

    @Override
    public void criar(String caminho) {
        File arquivo = new File(caminho);
        if (!arquivo.exists()) {
            arquivo.delete();
            try {
                arquivo.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                objOutput = new ObjectOutputStream(new FileOutputStream(arquivo));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
    
