/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Meire
 */
public class Locacao {
    
    private Pessoa pessoa;
    private Veiculo veiculo;
    private String dtRetorno, dtSaida;
    private boolean finalizado;

    public Locacao(Pessoa pessoa, Veiculo veiculo) throws Exception {
        existeVeiculoEPessoa(pessoa, veiculo);
        possuiCNH(pessoa, veiculo);
        setPessoa(pessoa);
        setVeiculo(veiculo);
    }

    private void existeVeiculoEPessoa(Pessoa pessoa, Veiculo veiculo) throws Exception {
        if (pessoa == null || veiculo == null) {
            throw new LocacaoException("Locação não pode ser realizada, por favor informe um veículo e uma pessoa válida");
        }
    }

    private void possuiCNH(Pessoa pessoa, Veiculo veiculo) throws Exception {
        if (veiculo instanceof VeiculoAutomotor) {
            PessoaFisica pf = null;
            if (pessoa instanceof PessoaFisica) {
                pf = (PessoaFisica) pessoa;
            } else {
                PessoaJuridica pj = (PessoaJuridica) pessoa;
                pf = pj.getResponsavel();
            }

            if (pf.getIdade() < 18) {
                throw new CNHException("Pessoa não habilitada: " + pf.getNome());
            }
            
            if (veiculo instanceof Carro && !"B".equalsIgnoreCase(pf.getCnh())) {
                throw new CNHException("CNH do usuário não é própria para o veículo selecionado Carro: " + pf.getNome() );
            } else if (veiculo instanceof Caminhao && !"D".equalsIgnoreCase(pf.getCnh())) {
                throw new CNHException("CNH do usuário não é própria para o veículo selecionado Caminhao: " + pf.getNome());
            } else if (veiculo instanceof Moto && !"A".equalsIgnoreCase(pf.getCnh())) {
                throw new CNHException("CNH do usuário não é própria para o veículo selecionado Moto: " + pf.getNome());
            }
        }
    }

    /**
     * @return the pessoa
     */
    public Pessoa getPessoa() {
        return pessoa;
    }

    /**
     * @param pessoa the pessoa to set
     */
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    /**
     * @return the veiculo
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }

    /**
     * @param veiculo the veiculo to set
     */
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    /**
     * @return the dtRetorno
     */
    public String getDtRetorno() {
        return dtRetorno;
    }

    /**
     * @param dtRetorno the dtRetorno to set
     */
    public void setDtRetorno(String dtRetorno) {
        this.dtRetorno = dtRetorno;
    }

    /**
     * @return the dtSaida
     */
    public String getDtSaida() {
        return dtSaida;
    }

    /**
     * @param dtSaida the dtSaida to set
     */
    public void setDtSaida(String dtSaida) {
        this.dtSaida = dtSaida;
    }

    /**
     * @return the finalizado
     */
    public boolean isFinalizado() {
        return finalizado;
    }

    /**
     * @param finalizado the finalizado to set
     */
    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

}

