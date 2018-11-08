package persistencia;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public interface Persistencia {
    public void criar(String caminho) throws IOException;
    
    public Object ler(String caminho) throws IOException;
    
    public void salvar(Object objeto) throws IOException;
}
