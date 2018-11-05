package negocio;

import classes.VeiculoAutomotor;
import persistencia.VeiculoAutomotorPersistencia;

/**
 *
 * @author rafae
 */
public class VeiculoAutomotorNE {
    public void cadastrar(VeiculoAutomotor veiculo) throws Exception{
        VeiculoAutomotor v = veiculo;
        if (v.getModelo() != null && v.getModelo().length() >= 1) {
        } else {
            throw new Exception("É necessário que você preencha o campo MODELO");
        }
        /*if (v.getTipo() == null);
        throw new Exception("É necessário selecionar um tipo de veículo válido");*/
        VeiculoAutomotorPersistencia veiculoAutomotorPersistencia = new VeiculoAutomotorPersistencia(v);
    }
}
