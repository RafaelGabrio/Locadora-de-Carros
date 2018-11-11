package classes;

/**
 *
 * @author rafae
 */
public class VeiculoTracaoAnimal extends Veiculo{ 
    @Override
    public String toString(){
        return "Marca: "+this.getMarca()+" - Tipo: "+this.getClass();
    }
}
