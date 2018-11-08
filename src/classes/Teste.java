/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.IOException;
import java.util.List;
import persistencia.PersistenciaArquivo;

/**
 *
 * @author rafae
 */
public class Teste {
    public static void main(String[] args) throws IOException {
       PessoaFisica p = (PessoaFisica) new PersistenciaArquivo().ler("C:\\Users\\rafae\\Documents\\NetBeansProjects\\trabalholocadora\\trabalholocadora\\trabalholocadora\\BD\\Pessoas\\Pessoa.dat").get(0);
    }
}
