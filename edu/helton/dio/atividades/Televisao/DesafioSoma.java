package edu.helton.dio.atividades.Televisao;

import java.util.Scanner;

public class DesafioSoma {
    public static void main(String[] args) {
        int A, N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();
        int somaTotal = 0;
        
        for( int i = A; i <= N; i += A ){
          
          somaTotal += i;
          System.out.println(somaTotal);
          
        }
        
        System.out.println(somaTotal);
        
        

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".
    }
}