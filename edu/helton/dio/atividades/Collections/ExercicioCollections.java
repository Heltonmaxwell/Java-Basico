package edu.helton.dio.atividades.Collections;

import java.util.ArrayList;
import java.util.List;

public class ExercicioCollections {

    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{

            add(new Gato("Mancoso", 12, "Tigrado"));
            add(new Gato("Raissa moda fashion", 24, "Tigrado"));
            add(new Gato("Mimosa", 30, "Tigrado"));

        }};


        
    }

    
    
}

class Gato(){
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome(){
        return nome;
    }

    public Integer getIdade(){
        return idade;
    }

    public String getCor(){
        return cor;
    }

}


