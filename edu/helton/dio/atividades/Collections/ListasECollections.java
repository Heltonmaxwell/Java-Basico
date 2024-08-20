package edu.helton.dio.atividades.Collections;

import java.util.ArrayList;
import java.util.List;

public class ListasECollections {

    public static void main(String[] args) {
        
        List <Double> notas = new ArrayList<Double> ();
        notas.add(7d);
        notas.add(8d);
        notas.add(6.5);
        notas.add(9.3);
        notas.add(2.7);
        notas.add(7.5);
        notas.add(5.0);

        System.out.println(notas.toString());
        System.out.println("O número 6.5 está na posição: "+notas.indexOf(6.5));
        notas.add(4,4d);
        System.out.println(notas);
        notas.set(notas.indexOf(7d), 9d);
        System.out.println(notas);

        for(Double nota: notas) System.out.println(nota);

    }
    
}
