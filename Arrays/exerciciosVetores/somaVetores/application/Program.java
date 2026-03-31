package Arrays.exerciciosVetores.somaVetores.application;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] vect1 = new int[n];
        int[] vect2 = new int[n];
        int[] vect3 = new int[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < vect1.length; i++){
            vect1[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int j = 0; j < vect1.length; j++){
            vect2[j] = sc.nextInt();
        }

        for (int k = 0; k < vect3.length; k++){
            vect3[k] = vect1[k] + vect2[k];
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < vect3.length; i++){
            System.out.println(vect3[i]);
        }



        sc.close();
    }
}
