package classes;

/**
 *
 * @author rafae
 */
public class Pessoa {
    private String nome;
    
    public Pessoa(String nome){
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
