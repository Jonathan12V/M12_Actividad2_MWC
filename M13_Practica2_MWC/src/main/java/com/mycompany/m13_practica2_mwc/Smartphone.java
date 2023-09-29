package com.mycompany.m13_practica2_mwc;

public class Smartphone extends Dispositivos implements GammaAlta {
    
    private String sistema_operativo;
    private boolean accelerometro;
    private boolean gps;

    public Smartphone(String marca, String model, double preuBase, String sistema_operativo, 
            boolean accelerometro, boolean gps) {
        super(marca, model, preuBase);
        this.sistema_operativo = sistema_operativo;
        this.accelerometro = accelerometro;
        this.gps = gps;
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

    public void setSistema_operativo(String sistema_operativo) {
        this.sistema_operativo = sistema_operativo;
    }

    public void setAccelerometro(boolean accelerometro) {
        this.accelerometro = accelerometro;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }
    
    public double getPrecioFinal() {
        
        double precioFinal = getPreuBase();
        
        if (accelerometro) {
            precioFinal *= 1.10;
            if(gps) {
                precioFinal *= 1.05;
            }
        }
        
        precioFinal = Math.round(precioFinal * 100.0) / 100.0;
        
        return precioFinal;    
    }

    @Override
    public Boolean isGammaAlta() {

        return getPrecioFinal() > 700;

    }
   
    @Override
    public String toString() {
        return "Smartphone{" + "marca=" + marca + ", model=" + model + ", preuBase=" + preuBase + ", sistema_operativo=" + sistema_operativo + ", accelerometro=" + accelerometro + ", gps=" + gps + '}';
    }  
}
