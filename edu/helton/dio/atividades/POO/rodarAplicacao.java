package edu.helton.dio.atividades.POO;

import java.util.Scanner;

public class rodarAplicacao {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Carro carro1 = new Carro();

        carro1.setModelo("civic");
        carro1.setCor("cinza");
        carro1.setCapacidadeTanque(60);

        System.out.println("--- Status do carro ---"+"\n");
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.valorTotalTanque(6.8, carro1.getCapacidadeTanque())+"\n");

        Carro carro2 = new Carro("Civic Type-R", "Branco", 80);

        System.out.println("--- Status do carro ---"+"\n");
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.valorTotalTanque(6.8, carro2.getCapacidadeTanque())+"\n");

    }
}
