/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import classes.CNHException;
import classes.Caminhao;
import classes.Carro;
import classes.Locacao;
import classes.LocacaoException;
import classes.Locadora;
import classes.Moto;
import classes.Pessoa;
import classes.PessoaFisica;
import classes.PessoaJuridica;
import classes.Veiculo;
import classes.VeiculoAutomotor;
import persistencia.Persistencia;
import persistencia.LocacaoPersistencia;

/**
 *
 * @author Meire
 */
public class LocacaoNE {
    Persistencia persistencia;
    public void cadastrar(Locacao l, Pessoa p, Veiculo v) throws Exception{
        if (l.getPessoa() == null || l.getVeiculo() == null)
            throw new LocacaoException("Locação não pode ser realizada!\n"
                    + "Por favor informe um veículo e/ou uma pessoa válida.");
        if (v instanceof VeiculoAutomotor) {
            PessoaFisica pf = null;
            if (p instanceof PessoaFisica) {
                pf = (PessoaFisica) p;
            } else {
                PessoaJuridica pj = (PessoaJuridica) p;
                pf = pj.getResponsavel();
            }

            if (pf.getIdade() < 18) {
                throw new CNHException("Pessoa não habilitada: " + pf.getNome());
            }
            
            if (v instanceof Carro && !"B".equalsIgnoreCase(pf.getCnh())) {
                throw new CNHException("CNH do usuário não é própria para o veículo selecionado Carro: " + pf.getNome() );
            } else if (v instanceof Caminhao && !"D".equalsIgnoreCase(pf.getCnh())) {
                throw new CNHException("CNH do usuário não é própria para o veículo selecionado Caminhao: " + pf.getNome());
            } else if (v instanceof Moto && !"A".equalsIgnoreCase(pf.getCnh())) {
                throw new CNHException("CNH do usuário não é própria para o veículo selecionado Moto: " + pf.getNome());
            }
        }
        new LocacaoPersistencia(l);
}
}
