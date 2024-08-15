package edu.helton.dio.atividades.SobrecargaMetodos;

public class Quadrilatero {

    public static void area(double lado){

        System.out.println("Área do quadrado: "+lado*lado+"\n");

    }

    public static void area(double lado1, double lado2) {

        System.out.println("Área do retângulo: "+ lado1*lado2 +"\n");

    }

    public static void area(double baseMaior, double baseMenor, double altura){

        System.out.println("Área do trapézio: "+ ((baseMaior+baseMenor)*altura)/2 +"\n");

    }
    
}
