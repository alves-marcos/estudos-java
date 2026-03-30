package application;


import util.Calculadora;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro valor : ");
        double x = sc.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double y = sc.nextDouble();

        double soma = Calculadora.sum(x, y);
        double sub = Calculadora.sub(x, y);
        double mult = Calculadora.mult(x, y);
        double div = Calculadora.div(x, y);

        System.out.printf("Soma: %.2f%n", soma);
        System.out.printf("Subtração: %.2f%n", sub);
        System.out.printf("Multiplicação: %.2f%n", mult);
        System.out.printf("Divisão: %.2f%n", div);
        sc.close();
    }
}
