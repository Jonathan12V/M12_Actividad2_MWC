package com.mycompany.m13_practica2_mwc;

//Classe tablet que extiende de la Clase Dispositivos e implementa la interfaz GammaAlta

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

    //metodo que nos indica el precio final,
    //multiplicando por  el precio base 
    public Double preuFinal() {
        return getPreuBase() * 2;
    }

    //metodo que nos indica si el dispositivo
    //es gama alta. Pra hacer esto, vemos si el
    //precio es mayor a 900 (true), lo es. Si es
    //mas pequeño, no lo es
    public Boolean isGammaAlta() {
        return preuFinal() > 900;
    }

    //Nos devuelve las pulgadas que tiene
    //una tablet en una frase
    @Override
    public String toString() {
        return "Tablet{" + "marca=" + marca + ",model =" + model + ", preu Base= " + preuBase + "polzades=" + polzades + "}";
    }

}
