package edu.helton.dio.atividades.Televisao;

import java.util.Scanner;
import java.util.Random;

public class MatrizEmJava{
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Random aleatorio = new Random();

        int[][] matriz = new int[4][4];

        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = aleatorio.nextInt(9);
                System.out.print(matriz[i][j]+" | ");
            }
            System.out.println("\n");
        }
    }
}
