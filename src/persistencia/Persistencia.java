package persistencia;

import java.io.IOException;

/**
 *
 * @author rafae
 */
public interface Persistencia {
    public void criar(String caminho);
    
    public Object ler(String caminho) throws IOException;
    
    public void salvar(Object objeto) throws IOException;
}
