package persistencia;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author rafae
 */
public interface Persistencia {
    
    public Object ler(String caminho) throws IOException;
    
    public void salvar(Object objeto,String caminho) throws IOException;

}
