package Arrays.ExerciciosRefeitos.maisVelho.src.application;

import entities.Pessoas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar? ");
        int qtd = sc.nextInt();
        sc.nextLine();

        Pessoa[] pessoas = new Pessoa[qtd];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Dados da " + (i + 1) + "º pessoa:");
            System.out.print("Nome:");
            String name = sc.nextLine();

            System.out.print("Idade:");
            int idade = sc.nextInt();
            sc.nextLine();

            pessoas[i] = new Pessoa(name, idade);
        }

        int velho = 0;
        String nameVelho = "";

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() > velho) {
                velho = pessoas[i].getIdade();
                nameVelho = pessoas[i].getName();
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nameVelho);

        sc.close();
    }
}