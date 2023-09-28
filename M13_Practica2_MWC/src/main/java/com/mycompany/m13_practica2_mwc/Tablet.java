package com.mycompany.m13_practica2_mwc;

//Classe tablet

public class Tablet {
    private int polzades;
    private String id;

    public Tablet(String id, int polzades){
        this.id = id;
        this.polzades = polzades;
    } 
     public Tablet(String id){
        this.id = id;
    } 
     public Tablet(int polzades){
        this.polzades = polzades;
    } 

    //getter
    public String getId() {
        return id;
    }
    public int getPolzades() {
        return polzades;
    }

    //setter
    public void setId(String id) {
        this.id = id;
    }

    public void setDireccion(int polzades) {
        this.polzades = polzades;
    }

}
