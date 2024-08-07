package edu.helton.dio.atividades.Televisao;

public class SmartTv {
    boolean estadoLigada = false;
    int volume = 20;
    int canal = 1;


    public void ligarTelevisao(){
        estadoLigada = true;
        System.out.println("Estado: "+estadoLigada);
    }
    
    public void desligarTelevisao(){
        estadoLigada = false;
        System.out.println("Estado: "+estadoLigada);
    }



    public void aumentarVolume(){
        if (estadoLigada == true){
            if(volume < 100){
                volume++;
            }else{
                System.out.println("Volume: Max");
            }
        }else{
            System.out.println("Você precisa ligar a televisão primeiro. ");
        }
        
    }
    public void diminuirVolume(){
        if(estadoLigada == true){
            if(volume > 0){
                volume--;
            }else{
                System.out.println("Volume: Max");
            }
        }
        else{
            System.out.println("Você precisa ligar a televisão primeiro. ");
        }
    
    }

    public void mudarCanalAcima(){
        if(estadoLigada == true){
            if(canal < 100){
                canal++;

            }else{
                canal = 1;
            }
        }else{
            System.out.println("Você precisa ligar a televisão primeiro");
        }
    }

    public void mudarCanalAbaixo(){
        if(estadoLigada == true){
            if(canal > 0){
                canal--;

            }else{
                canal = 100;
            }
        }else{
            System.out.println("Você precisa ligar a televisão primeiro");
        }
    }

    public void mudarCanal(int canalEscolhido){
        if(estadoLigada == true){
            if(canalEscolhido > 0 && canalEscolhido < 100){
                canal = canalEscolhido;
            }
        }
    }

    public void mostrarStatus(){
        System.out.println("Estado: "+estadoLigada);
        System.out.println("Volume: "+volume);
        System.out.println("Canal: "+canal);
    }
}


