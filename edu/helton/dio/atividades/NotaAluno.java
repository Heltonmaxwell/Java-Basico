package edu.helton.dio.atividades;
import java.util.Scanner;

public class NotaAluno {
    
public static void main (String[] args){
    //Scanner ler = new Scanner();
    float nota1 = 8;
    float nota2 = 6;

    float mediaFinal = mediaFinal(nota1,nota2);
    System.out.println("Sua média é: "+mediaFinal);
    
    if(mediaFinal < 4){
        System.out.println("Você não foi aprovado.");
    }else if (mediaFinal < 6) {
        System.out.println("Você ainda tem uma chance, pois está de recuperação");
    }else{
        System.out.println("Parabéns! Você está aprovado.");
    }
    
}

public static float mediaFinal(float n1, float n2){
    float media = (n1+n2)/2;
    return media;
}

}
