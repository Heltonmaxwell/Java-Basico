package edu.helton.dio.atividades.Televisao;

import java.util.Scanner;

public class DesafioSomaRecursiva {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int valor = scan.nextInt();
        int somaTotal = 0;
        
        somaTotal = somatorio(valor);
        System.out.println(somaTotal);

        
    }    
      
    /**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
