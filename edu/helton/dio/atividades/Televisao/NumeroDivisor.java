package edu.helton.dio.atividades.Televisao;
import java.util.Scanner;

public class NumeroDivisor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        String moduloNumero = retornarValor(num);

        System.out.println(moduloNumero);
        
        
        // TODO: Retorne a palavra correta de acordo com o múltiplo de "num". 
        // Caso o valor não seja múltiplo de 3 ou 5, exiba o número, conforme o enunciado.

    }

    static String retornarValor(int numero){
        
        if(numero %3 == 0){
            if(numero %5 == 0){
                return "FizzBuzz";
            }else{
                return "Fizz";
            }
          
        }else if(numero %5 == 0){
            return "Buzz";
        }else{
            return numero + "";
        }
        
      }

}

