package com.mycompany.m13_practica2_mwc;

// Clase Dispositivos
public class Dispositivos {
    protected  String  marca;
    protected String model;
    protected double preuBase;

    public Dispositivos(){
        
    }
    public Dispositivos(String marca, String model, double preuBase) {
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPreuBase() {
        return preuBase;
    }

    public void setPreuBase(double preuBase) {
        this.preuBase = preuBase;
    }


}
