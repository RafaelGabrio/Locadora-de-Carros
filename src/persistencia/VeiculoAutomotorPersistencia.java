package persistencia;

import classes.VeiculoAutomotor;
import java.io.IOException;

/**
 *
 * @author rafae
 */
public class VeiculoAutomotorPersistencia {
    private Persistencia persistencia;
    
    public VeiculoAutomotorPersistencia(VeiculoAutomotor veiculo) throws IOException{
        Persistencia p = new PersistenciaArquivo();
        p.salvar(veiculo, "C:\\Users\\rafae\\Documents\\NetBeansProjects\\trabalholocadora\\trabalholocadora"
                + "\\trabalholocadora\\BD\\Veiculos\\Veiculo_Auto.dat");
    }
}

/*
persistencia.salvar("C:\\Users\\rafae\\Documents\\NetBeansProjects\\trabalholocadora"
                + "\\trabalholocadora\\trabalholocadora\\BD\\VeiculosAutomotor\\VeiculoAut_"+veiculo.getModelo()+".txt", veiculo);
  */
