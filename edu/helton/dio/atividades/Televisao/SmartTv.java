package edu.helton.dio.atividades.Televisao;

public class SmartTv {
    boolean estadoLigada = false;
    int volume = 20;
    int canal = 1;
    String escolha = "";


    public void ligarTelevisao(){
        estadoLigada = true;
    }
    
    public void desligarTelevisao(){
        estadoLigada = false;
    }



    public void aumentarVolume(){
        if (estadoLigada == true){
            if(volume < 100){
                volume++;
            }else{
                System.out.println("O Volume ja está no máximo");
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
                System.out.println("O volume ja está no menor valor possível.");
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
        System.out.println("----Utilize os comandos abaixo----");
        System.out.println("* Ligar a TV - ligar.");
        System.out.println("* Desligar a TV - desligar.");
        System.out.println("* Aumentar o volume - v+");
        System.out.println("* Diminuir o volume - v-");
        System.out.println("* Subir canal - c+");
        System.out.println("* Diminuir canal - c-");
        System.out.println("* Escolher canal - canal \n");

        System.out.println("Estado: "+estadoLigada);
        System.out.println("Volume: "+volume);
        System.out.println("Canal: "+canal);
    }

}


