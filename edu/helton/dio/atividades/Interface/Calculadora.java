package edu.helton.dio.atividades.Interface;

/*No conceito de interface, o programa deve receber todos os métodos da interface, não importando a forma 
 * em como esses métodos serão inseridos, mas por OBRIGATORIEDADE, deve possuir todos os métodos, pois a interface
 * irá necessitar requisitar o método.
 */

public class Calculadora implements OperacaoMatematica{
    
    @Override
    public void soma(double valor1, double valor2){
        System.out.println("Soma: "+(valor1 + valor2));
    }

    @Override
    public void subtracao(double valor1, double valor2){
        System.out.println("Subtração: "+(valor1 - valor2));
    }

    @Override
    public void divisao(double valor1, double valor2){
        System.out.println("Divisão: "+(valor1 / valor2));
    }

    @Override
    public void multiplicacao(double valor1, double valor2){
        System.out.println("Multiplicação: "+(valor1 * valor2));
    }


}
