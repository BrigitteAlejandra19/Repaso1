package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi World");


        Gato felix = new Gato( true, 10);
        Gato garfield = new Gato(false, 20);

        if (felix.tieneHambre()){
            felix.comer();
        }else{
            System.out.println("Felix no tiene Hambre");
        }
    }
}
