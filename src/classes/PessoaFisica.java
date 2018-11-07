package classes;

import java.io.Serializable;

/**
 *
 * @author rafae
 */
public class PessoaFisica extends Pessoa implements Serializable{
    private String sexo, cpf, cnh;
    private int idade;

    public PessoaFisica(String nome) {
        super(nome);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public String toString(){
        return this.getNome();
    }
}
