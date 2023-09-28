package com.mycompany.m13_practica2_mwc;

public class Smartphone extends Dispositivos implements GammaAlta {
    
    private String sistema_operativo;
    private boolean accelerometro;
    private boolean gps;

    public Smartphone(String marca, String model, double preuBase, String sistema_operativo, boolean accelerometro, boolean gps) {
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
        this.sistema_operativo = sistema_operativo;
        this.accelerometro = accelerometro;
        this.gps = gps;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public double getPreuBase() {
        return preuBase;
    }

    public String getSistema_operativo() {
        return sistema_operativo;
    }

    public boolean isAccelerometro() {
        return accelerometro;
    }

    public boolean isGps() {
        return gps;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPreuBase(double preuBase) {
        this.preuBase = preuBase;
    }

    public void setSistema_operativo(String sistema_operativo) {
        this.sistema_operativo = sistema_operativo;
    }

    public void setAccelerometro(boolean accelerometro) {
        this.accelerometro = accelerometro;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }
    
    public Double precioDoble(double precioBase) {
        
        double precioFinal = 0;
        
        if (accelerometro && gps) {
            precioFinal = precioBase * 1.10;
        }
        else if(accelerometro) {
            double precio2 = precioBase * 1.05;
            
            precio2 = precioBase-precio2;
            
            precioFinal += precio2;
        }
        
        return precioFinal;    
    }

    public Boolean isGammaAlta(boolean gammaAlta, double precioFinal ) {
        if (precioFinal > 700) {
            gammaAlta = true;
        }
        
        return gammaAlta;
    }
   
    @Override
    public String toString() {
        return "Smartphone{" + "marca=" + marca + ", model=" + model + ", preuBase=" + preuBase + ", sistema_operativo=" + sistema_operativo + ", accelerometro=" + accelerometro + ", gps=" + gps + '}';
    }

    @Override
    public Boolean isGammaAlta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }    
}
