package persistencia;

import classes.VeiculoTracaoAnimal;
import java.io.IOException;

/**
 *
 * @author rafae
 */
public class VeiculoTracaoAnimalPersistencia {
    Persistencia persistencia;
    public VeiculoTracaoAnimalPersistencia(VeiculoTracaoAnimal v) throws IOException{
        persistencia = new PersistenciaArquivo();
        persistencia.salvar(v, "src\\BD\\VeiculoAni.dat");
    }
}
