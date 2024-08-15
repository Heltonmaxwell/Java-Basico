package edu.helton.dio.atividades.Televisao;

import java.util.Scanner;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

        int elemento = leitor.nextInt(); 
        
        System.out.println(buscarElemento(elementos, elemento));

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

    }
    
    static String buscarElemento(int [] lista, int valor){

        String encontrarElemento = "Numero "+valor+" não encontrado!";

        for( int i = 0; i < lista.length -1;i++ ){
            if(lista[i] == valor){
                encontrarElemento = "achei "+lista[i]+" na posição "+i;
                break;
            }
        
        }
        return encontrarElemento;
    }
}