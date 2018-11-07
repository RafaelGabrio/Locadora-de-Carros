package persistencia;

import classes.PessoaJuridica;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author rafae
 */
public class PersistenciaArquivo implements Persistencia{

    @Override
    public void salvar(String caminho, Object objeto) throws IOException {
        /*BufferedWriter buffWrite = new BufferedWriter(new FileWriter(caminho));
        buffWrite.append(objeto+"\n");
        buffWrite.close();
        */
        File arquivo = new File(caminho);
        try{
            arquivo.delete();
            arquivo.createNewFile();
            
            ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(arquivo));
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
            ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(arquivo)); 
            linha = (Object)objInput.readObject();
            return linha;
        }
      } catch(IOException erro1) {
          System.out.printf("Erro: %s", erro1.getMessage());
      } catch(ClassNotFoundException erro2) {
          System.out.printf("Erro: %s", erro2.getMessage());
      }
        
        return linha;
    }

}
    
