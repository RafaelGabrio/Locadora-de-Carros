package negocio;

import classes.VeiculoTracaoAnimal;
import persistencia.Persistencia;
import persistencia.VeiculoTracaoAnimalPersistencia;

/**
 *
 * @author rafae
 */
public class VeiculoTracaoAnimalNE {
    Persistencia persistencia;
    public void cadastrar(VeiculoTracaoAnimal v) throws Exception{
        if (v.getMarca() == null)
            throw new Exception("O campo MARCA precisa ser preenchido");
        new VeiculoTracaoAnimalPersistencia(v);
    }
}
