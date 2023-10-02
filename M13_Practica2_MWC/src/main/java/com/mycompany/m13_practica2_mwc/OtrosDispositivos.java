package com.mycompany.m13_practica2_mwc;

public class OtrosDispositivos extends Dispositivos implements GammaAlta {
    
    private String descripcio;

    public OtrosDispositivos(String marca, String modelo, double preuBase, String descripcio){
        super(marca, modelo, preuBase);
        this.descripcio = descripcio;
    } 

    //getter
    public String getDescripcio() {
        return descripcio;
    }

    //setter
    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    //precio final
    public Double getPreuFinal() {
        return getPreuBase() * 2;
    }

    //Descripcion
    @Override
    public String toString() {
        return "OtrosDispositivos{" + "marca=" + marca + ", model =" + model + ", preuBase= " + preuBase + ", descripcio=" + descripcio + "}";
    }
  
}