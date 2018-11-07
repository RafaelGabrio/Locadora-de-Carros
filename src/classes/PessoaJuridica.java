package classes;

/**
 *
 * @author rafae
 */
public class PessoaJuridica extends Pessoa {
    private String cnpj;
    private PessoaFisica responsavel;
    
    
    
    public PessoaJuridica(String nome) {
        super(nome);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaFisica getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(PessoaFisica responsavel) {
        this.responsavel = responsavel;
    }
    
    
}
