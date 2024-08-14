package edu.helton.dio.atividades.Televisao;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        SmartTv HQ = new SmartTv();

        do{
            HQ.mostrarStatus();
            HQ.escolha = ler.next();
            
            switch (HQ.escolha) {
                case "ligar":
                    HQ.ligarTelevisao();
                    break;

                case "desligar":
                    HQ.desligarTelevisao();
                    break;

                case "c+":
                    HQ.mudarCanalAcima();
                    break;

                case "c-":
                    HQ.mudarCanalAbaixo();
                    break;

                case "v+":
                    HQ.aumentarVolume();
                    break;

                case "v-":
                    HQ.diminuirVolume();
                    break;

                case "canal":
                    HQ.mudarCanal();                        
                    break;

                default:
                    System.out.println("Comando não reconhecido, tente novamente. ");
                    break;
                    
            }
        }while(HQ.escolha != "desligar");

        
    }
}
