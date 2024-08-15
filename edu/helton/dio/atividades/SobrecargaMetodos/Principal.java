package edu.helton.dio.atividades.SobrecargaMetodos;
import java.util.Scanner;

public class Principal{

    public static void main (String [] args){

        Scanner ler = new Scanner(System.in);

        while (true) {

            System.out.println("Escolha qual figura geométrica você deseja ver a área: ");
            String figura = ler.next();

            switch(figura){

                case "quadrado":

                    System.out.println("Digite o lado do quadrado: ");

                    double lado = ler.nextDouble();

                    Quadrilatero.area(lado);

                    break;
                    
                case "retangulo":

                    System.out.println("Digite o valor do lado maior do retângulo: ");

                    double lado1 = ler.nextDouble();

                    System.out.println("Digite o valor do lado menor do retângulo: ");

                    double lado2 = ler.nextDouble();

                    Quadrilatero.area(lado1, lado1);

                    break;

                case "trapezio":

                    System.out.println("Digite o valor da base maior: ");

                    double ladoMaior = ler.nextDouble();

                    System.out.println("Digite o valor da base menor: ");

                    double ladoMenor = ler.nextDouble();

                    System.out.println("Digite o valor da altura: ");

                    double altura = ler.nextDouble();
                    
                    Quadrilatero.area(ladoMaior, ladoMenor, altura);
                
                default:
                    break;

            }
        
        }

        
        
    }
}

