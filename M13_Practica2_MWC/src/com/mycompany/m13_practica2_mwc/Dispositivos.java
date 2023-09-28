package com.mycompany.m13_practica2_mwc;

public class Dispositvos {
    protected  String  marca;
    protected String model;
    protected double preuBase;


    public Dispositvos(String marca, String model, double preuBase) {
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

    public int getPreuBase() {
        return preuBase;
    }

    public void setPreuBase(int preuBase) {
        this.preuBase = preuBase;
    }


}