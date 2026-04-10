package application;

import entities.Pessoas;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas pessoas serao digitadas? ");
        int qtd = sc.nextInt();

        Pessoas[] pessoa = new Pessoas[qtd];

        for (int i = 0; i < pessoa.length; i++) {
            System.out.print("Altura da " + (i + 1) + " º pessoa: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            System.out.print("Genero da " + (i + 1) + " º pessoa: ");
            String gen = sc.nextLine();

            pessoa[i] = new Pessoas(altura, gen);
        }

        double maior = pessoa[0].getAltura();
        double menor = pessoa[0].getAltura();

        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getAltura() > maior) {
                maior = pessoa[i].getAltura();
            }
            if (pessoa[i].getAltura() < menor) {
                menor = pessoa[i].getAltura();
            }
        }

        double somaAlturaMulher = 0.0;
        int contMulher = 0;
        int contHomem = 0;
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getGenero().equals("F")) {
                somaAlturaMulher = somaAlturaMulher + pessoa[i].getAltura();
                contMulher++;
            } else {
                contHomem++;
            }
        }

        double mediaMulher = somaAlturaMulher / contMulher;

        System.out.println("Menor altura = " + menor);
        System.out.println("Maior altura = " + maior);

        System.out.printf("Media das alturas das mulheres = %.2f\n", mediaMulher);
        System.out.println("Numero de homens = " + contHomem);


        sc.close();
    }
}