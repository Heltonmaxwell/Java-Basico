package edu.helton.dio.atividades;
import java.util.Scanner;

public class MeuApp{
    //programando a primeira classe
    public static void main(String[] args) {
       
        String primeiroNome = "Helton";
        String segundoNome = "Maxwell";
        String nomeCompleto = juntarNomes(primeiroNome, segundoNome);

        System.out.println(nomeCompleto));
    }

    public static String juntarNomes (String primeiroNome, String segundoNome){
        return "Olá, " + primeiroNome.concat(" ").concat(segundoNome);
    }
    
}