package persistencia;

import classes.PessoaFisica;
import java.io.IOException;

/**
 *
 * @author rafae
 */
public class PessoaFisicaPersistencia {
    private Persistencia persistencia;
    
    
    public PessoaFisicaPersistencia(PessoaFisica p) throws IOException{
        persistencia = new PersistenciaArquivo();
        persistencia.salvar("C:\\Users\\rafae\\Documents\\NetBeansProjects\\trabalholocadora\\trabalholocadora\\trabalholocadora\\BD\\Pessoas\\Pessoa_"+p.getCpf()+".txt", p);
    }
}
