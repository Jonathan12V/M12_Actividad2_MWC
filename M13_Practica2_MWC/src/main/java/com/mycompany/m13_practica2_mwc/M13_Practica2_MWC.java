package com.mycompany.m13_practica2_mwc;

public class M13_Practica2_MWC {
    
    public static void main(String[] args) {
        
        Smartphone smartphone1 = new Smartphone("Samsung", "S6", 300, "Android", false, false);
        Smartphone smartphone2 = new Smartphone("Xiami", "Redmi Note 10", 500, "Android", true, true);
        Tablet tablet1 = new Tablet("Samsung", "Galaxy Tab S7", 500, 9);
        OtrosDispositivos reloj = new OtrosDispositivos("Apple", "Apple Watch Series 6", 100, "Cuenta con funcionalidades como EGG, oxígeno en sangre, GPS incorporado..");
        OtrosDispositivos samsung = new OtrosDispositivos("Samsung", "Samsung Galaxy Watch 4", 800, "Ofrece un diseño elegante, seguimiento de la actividad física...");        
        
        // Smartphone 1
        System.out.println("Información del Smartphone 1: ");
        System.out.println(smartphone1);
        System.out.println("Precio Final de : " + smartphone1.getPrecioFinal());
        System.out.println("¿Es de GammaAlta? " + smartphone1.isGammaAlta() + "\n");
        
        // Smartphone 2
        System.out.println("Información del Smartphone 2: ");
        System.out.println(smartphone2);
        System.out.println("Precio Final de : " + smartphone2.getPrecioFinal());
        System.out.println("¿Es de GammaAlta? " + smartphone2.isGammaAlta() + "\n");
        
        // Tablet
        System.out.println("Información de la Tablet: ");
        System.out.println(tablet1);
        System.out.println("Precio Final: " + tablet1.preuFinal());
        System.out.println("¿Es de GammaAlta? " + tablet1.isGammaAlta() + "\n");
        
        // Reloj Inteligente
        System.out.println("Información del Reloj Inteligente:");
        System.out.println(reloj);
        System.out.println("Precio Final: " + reloj.getPreuFinal() + "\n4");
        
        // Otros Dispositivo (Samsung)
        System.out.println("Informacióndel del Samsung: ");
        System.out.println(samsung);
        System.out.println("Precio Final: " + samsung.getPreuFinal());
        
        
 
    }
}
