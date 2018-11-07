package classes;

import java.io.Serializable;

/**
 *
 * @author rafae
 */
public class Pessoa implements Serializable {
    private String nome;
    
    public Pessoa(String nome){
        this.setNome(nome);
    }
    
    public Pessoa(){
        
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
