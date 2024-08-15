package edu.helton.dio.atividades.Televisao;

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

      Scanner scan = new Scanner(System.in);

        //TODO: Imprima se os valores numéricos passados são iguais ou não.
        
        System.out.println("Digite um número: ");
        int A = scan.nextInt();
        System.out.println("Digite outro número: ");
        int B = scan.nextInt();

        if(A == B){
          System.out.println("Sao iguais!");
        }else{
          System.out.println("Nao sao iguais!");
        }
        

    }
}