package Arrays.exerciciosVetores.abaixoMedia.application;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sum = 0;


        System.out.print("Quantos elementos vai ter o vetor? ");
        int qtde = sc.nextInt();

        double[] elements = new double[qtde];
        double[] abaixoMedia = new double[qtde];

        for (int i = 0; i < elements.length; i++){
            System.out.print("Digite um numero: ");
            elements[i] = sc.nextDouble();
            sum = sum + elements[i];
        }

        double average = sum / elements.length;
        System.out.printf("MEDIA DO VETOR = %.3f", average);


        System.out.println("\n");
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (int i = 0; i < elements.length; i++){
            if (elements[i] < average){
                System.out.println(elements[i]);
            }
        }








        sc.close();
    }
}
