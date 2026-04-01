package application;

import entities.Pessoa;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        double soma = 0;
        double media = 0;

        System.out.printf("Quantas pessoas serao digitadas? ");
        int qtde = sc.nextInt();


        Pessoa[] nova = new Pessoa[qtde];

        for (int i = 0; i < nova.length; i++) {
            System.out.println("Dados da " + (i + 1) + " pessoa:");

            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();


            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Altura: ");
            double altura = sc.nextDouble();

            nova[i] = new Pessoa(name, idade, altura);
        }

        for (int i = 0; i < nova.length; i++) {
            soma = soma + nova[i].getAltura();
        }
        media = soma / nova.length;
        System.out.printf("Altura media = %.2f\n", media);

        int contador = 0;


        for (int i = 0; i < nova.length; i++) {
            if (nova[i].getIdade() < 16) {
                contador++;
            }
        }

        double numMenor16 = (contador * 100) / nova.length;
        System.out.printf("Pessoas com menos de 16 anos: %.1f\n", numMenor16 + "%");

        for (int i = 0; i < nova.length; i++) {
            if (nova[i].getIdade() > 16) {
                System.out.println(nova[i].getName());
            }
        }


        sc.close();
    }
}