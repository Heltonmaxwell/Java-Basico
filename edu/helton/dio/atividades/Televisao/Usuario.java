package edu.helton.dio.atividades.Televisao;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        SmartTv HQ = new SmartTv();

        do{
            HQ.mostrarStatus();
            ler.next(HQ.escolha);
            
            switch (HQ.escolha) {
                case "ligar":
                    HQ.ligarTelevisao();
                    
                case "desligar":
                    HQ.desligarTelevisao();
                    break;
                case "c+":
                    HQ.mudarCanalAcima();
                    
                case "c-":
                    HQ.mudarCanalAbaixo();
                    
                case "v+":
                    HQ.aumentarVolume();
                    
                case "v-":
                    HQ.diminuirVolume();
                    
                case "canal":
                    System.out.println("Digite um canal que deseja mudar: ");
                    ler.nextInt(HQ.canal);
                    HQ.mudarCanal(HQ.canal);
                    
                default:
                    System.out.println("Comando não reconhecido, tente novamente. ");
                    
            }
        }while(HQ.escolha == "desligar");

        
    }
}
