package persistencia;

import classes.PessoaJuridica;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author rafae
 */
public class PersistenciaArquivo implements Persistencia{

    @Override
    public void salvar(String caminho, Object objeto) throws IOException {
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(caminho));
        buffWrite.append(objeto+"\n");
        buffWrite.close();
    }

    @Override
    public Object ler(String caminho) throws IOException {
        BufferedReader buffRead = new BufferedReader(new FileReader(caminho));
        Object linha = buffRead.readLine();
        buffRead.close();
        return linha;
    }

}
    
