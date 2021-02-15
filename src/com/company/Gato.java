package com.company;

public class Gato {
    private Boolean tieneHambre = true;
    private Integer horasDeSuenio;

    public Gato(Boolean tieneHambre, Integer horasDeSuenio) {
        this.tieneHambre = tieneHambre;
        this.horasDeSuenio = horasDeSuenio;
    }

    public void comer() {
        System.out.println("Estoy comiendo");
        tieneHambre = false;
    }


    public boolean tieneHambre() {
            return tieneHambre;
    }
}
