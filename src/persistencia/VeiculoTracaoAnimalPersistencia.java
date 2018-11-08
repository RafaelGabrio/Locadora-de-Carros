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
        persistencia.salvar("C:\\Users\\rafae\\Documents\\NetBeansProjects\\trabalholocadora"
                + "\\trabalholocadora\\trabalholocadora\\BD\\Veiculos\\Veiculo_Ani.dat", v);
    }
}
