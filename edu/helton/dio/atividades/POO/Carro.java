package edu.helton.dio.atividades.POO;

class Carro {

    double capacidadeTanque;
    String modelo;
    String cor; 

    //CONSTRUTORES SEMPRE ABAIXO DOS ATRIBUTOS DA CLASSE

    Carro(){

    }

    Carro(String modelo, String cor, double capacidadeTanque){
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
    }

    //MÉTODOS GETs e SETs, PEGAR E INSERIR INFORMAÇÕES 

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setCapacidadeTanque(double capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

    double getCapacidadeTanque(){
        return capacidadeTanque;
    }

    //Métodos funcionais.

    double valorTotalTanque(double valorCombustivel, double capacidadeTanque){
        double valorTotal = valorCombustivel * capacidadeTanque;
        return valorTotal;
    }





}
