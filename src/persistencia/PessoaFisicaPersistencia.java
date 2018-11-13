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
        persistencia.salvar(p, "src\\BD\\Pessoa.dat");
    }
}
