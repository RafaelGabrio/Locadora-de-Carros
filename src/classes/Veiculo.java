package classes;

public class Veiculo {
    private String marca;
    private int ano;
    //private Veiculo tipo;

   /* public Veiculo getTipo() {
        return tipo;
    }

    public void setTipo(Veiculo tipo) {
        this.tipo = tipo;
    }*/
    
    

    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString(){
        return getMarca();
    }
}
