/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import classes.Locacao;
import persistencia.Persistencia;
import persistencia.LocacaoPersistencia;

/**
 *
 * @author Meire
 */
public class LocacaoNE {
    Persistencia persistencia;
    public void cadastrar(Locacao l) throws Exception{
        if (l.getPessoa()== null)
            throw new Exception("O campo pessoa precisa ser preenchido");
        if (l.getVeiculo()==null) 
            throw new Exception("O campo veículo precisa ser preenchido");

        new LocacaoPersistencia(l);
}
}
