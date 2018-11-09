/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import classes.Locacao;
import java.io.IOException;

/**
 *
 * @author Meire
 */
public class LocacaoPersistencia {
    Persistencia persistencia;
    public LocacaoPersistencia(Locacao l) throws IOException{
        persistencia = new PersistenciaArquivo();
        persistencia.salvar(l, "C:\\Users\\rafae\\Documents\\NetBeansProjects\\trabalholocadora"
                + "\\trabalholocadora\\trabalholocadora\\BD\\Locação\\Locacao.dat");
    }
}
