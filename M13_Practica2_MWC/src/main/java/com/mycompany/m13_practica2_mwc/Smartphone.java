package com.mycompany.m13_practica2_mwc;

// Declaración de la clase Smartphone, que extiende de la clase Dispositivos 
// e implementa la interfaz GammaAlta
public class Smartphone extends Dispositivos implements GammaAlta {
    
    // Declarar variables privadas de la clase Smartphone
    private String sistema_operativo;
    private boolean accelerometro;
    private boolean gps;

    // Constructor de la clase Smartphone que toma varios parámetros
    public Smartphone(String marca, String model, double preuBase, String sistema_operativo, 
            boolean accelerometro, boolean gps) {
        // Llama al constructor de la clase base Dispositivos utilizando super
        super(marca, model, preuBase);
        // Inicialitza las variables con los valores pasados
        this.sistema_operativo = sistema_operativo;
        this.accelerometro = accelerometro;
        this.gps = gps;
    }

    // Métodos getter y setter para las variables miembro
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
    
    // Método que calcula el precio final del Smartphone
    public double getPrecioFinal() {
        
        double precioFinal = getPreuBase();
        
        // Si el Smartphone tiene accelerometro
        if (accelerometro) {
            precioFinal *= 1.10;
            // Si tambien tiene GPS, se aplica un aumento adicional al precio
            if(gps) {
                precioFinal *= 1.05;
            }
        }
        
        // Redondea el precio final a dos decimales
        precioFinal = Math.round(precioFinal * 100.0) / 100.0;
        
        return precioFinal;    
    }

    // Implementación del método de la interfaz GammaAlta
    @Override
    public Boolean isGammaAlta() {
        // Comprueba si el precio final es mayor que 700, devuelve true o false.
        return getPrecioFinal() > 700;

    }
   
    // Sobreescribe el método toString para proporcionar una representación en cadena de texto
    @Override
    public String toString() {
        return "Smartphone{" + "marca=" + marca + ", model=" + model + ", preuBase=" + preuBase + ", sistema_operativo=" + sistema_operativo + ", accelerometro=" + accelerometro + ", gps=" + gps + '}';
    }  
}
