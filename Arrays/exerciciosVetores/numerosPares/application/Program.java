package Arrays.exerciciosVetores.numerosPares.application;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?");
        int qtde = sc.nextInt();

        int contador = 0;
        int[] vect = new int[qtde];
        int[] pares = new int[qtde];



        for (int i = 0; i < vect.length ; i++){
            System.out.print("Digite um número: ");
            int num = sc.nextInt();
            vect[i] = num;

            if (vect[i] % 2 == 0){
                pares[contador] = vect[i];
                contador = contador + 1;
            }
        }

        System.out.println();
        System.out.print("Números pares: ");
        for (int i = 0; i < contador; i++){
            System.out.print(pares[i] + " ");
        }


        System.out.println("\n");
        System.out.print("QUANTIADE DE PARES: " + contador);

        sc.close();
    }
}
