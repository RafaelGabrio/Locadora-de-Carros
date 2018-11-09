package persistencia;

import classes.PessoaJuridica;
import java.io.IOException;

/**
 *
 * @author rafae
 */
public class PessoaJuridicaPersistencia {
    private Persistencia persistencia;
    
    public PessoaJuridicaPersistencia(PessoaJuridica p) throws IOException{
        persistencia = new PersistenciaArquivo();
        persistencia.salvar(p, "C:\\Users\\rafae\\Documents\\NetBeansProjects\\trabalholocadora"
                + "\\trabalholocadora\\trabalholocadora\\BD\\PessoasJuridicas\\PessoaJ.dat");
    }
    
}
