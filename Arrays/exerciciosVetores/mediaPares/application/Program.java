package Arrays.exerciciosVetores.mediaPares.application;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        double soma = 0;
        int divisor = 0;


        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int qtde = sc.nextInt();

        int[] vetor = new int[qtde];
        int[] vetorPar = new int[qtde];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < vetorPar.length; i++){
            if (vetor[i] % 2 == 0){
                vetorPar[i] = vetor[i];
                soma = soma + vetor[i];
            }
        }

        for (int i = 0; i < vetorPar.length; i++){
            if (vetorPar[i] != 0){
                divisor = divisor + 1;
            }
        }

        if (soma != 0){
            double avg = soma / divisor;
            System.out.printf("MEDIA DOS PARES = %.1f", avg);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }




        sc.close();
    }
}
