package negocio;

import classes.Carro;
import classes.VeiculoAutomotor;

/**
 *
 * @author rafae
 */
public class VeiculoAutomotorNE {
    public void cadastrar(VeiculoAutomotor veiculo) throws Exception{
        VeiculoAutomotor v = (VeiculoAutomotor)veiculo;
        if (v.getModelo().equals(null))
            throw new Exception("É necessário que você preencha o campo MODELO");
        if (v.getTipo() == null);
            throw new Exception("É necessário selecionar um tipo de veículo válido");
    }
}
