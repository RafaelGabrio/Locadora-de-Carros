package persistencia;

import java.io.IOException;

/**
 *
 * @author rafae
 */
public interface Persistencia {
    public void ler(String caminho, Object objeto) throws IOException;
    
    public void salvar(String caminho, Object objeto) throws IOException;
}
