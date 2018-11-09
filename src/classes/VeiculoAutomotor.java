/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author geoleite
 */
public class VeiculoAutomotor extends Veiculo{
    private int km;
    private String tipoCompustivel, modelo;
    Object tipo;
    /**
     * @return the km
     */
    public int getKm() {
        return km;
    }

    /**
     * @param km the km to set
     */
    public void setKm(int km) {
        this.km = km;
    }

    /**
     * @return the tipoCompustivel
     */
    public String getTipoCompustivel() {
        return tipoCompustivel;
    }

    /**
     * @param tipoCompustivel the tipoCompustivel to set
     */
    public void setTipoCompustivel(String tipoCompustivel) {
        this.tipoCompustivel = tipoCompustivel;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String toString(){
        return "Modelo: "+getModelo()+";  Km atual: "+this.getKm()+";  Marca: "+this.getMarca()+";  Tipo: "+this.getClass();
    }
}
