package Arrays.exerciciosVetores.maisVelho.application;

import Arrays.exerciciosVetores.maisVelho.entitites.Pessoa;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas voce vai digitar? ");
        int qtde = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[qtde];

        for (int i = 0; i < pessoas.length; i++){
            System.out.println("Dados da " + (i + 1) + " pessoa: ");

            sc.nextLine();

            System.out.print("Nome: ");
            String name = sc.nextLine();


            System.out.print("Idade: ");
            int idade = sc.nextInt();

            pessoas[i] = new Pessoa(name, idade);

        }


        for (int i = 0; i < pessoas.length; i++){
            if (pessoas[i] = new Pessoa())
        }


        System.out.println(Arrays.toString(pessoas));


        sc.close();
    }
}
