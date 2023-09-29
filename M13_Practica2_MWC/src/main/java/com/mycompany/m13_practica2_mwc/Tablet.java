package com.mycompany.m13_practica2_mwc;

//Classe tablet

public class Tablet extends Dispositivos implements GammaAlta {
    private int polzades;

    public Tablet(String marca, String modelo, Double preuBase, int polzades){
        super(marca, modelo, preuBase);
        this.polzades = polzades;
    } 

     public Tablet(int polzades){
        this.polzades = polzades;
    } 

    //getter
    public int getPolzades() {
        return polzades;
    }

    //setter

    public void setPolzades(int polzades) {
        this.polzades = polzades;
    }

    public Double preuFinal() {
        return getPreuBase() * 2;
    }

    public Boolean isGammaAlta() {
        return preuFinal() > 900;
    }

    @Override
    public String toString() {
        return "Tablet [polzades=" + polzades + "]";
    }

}
