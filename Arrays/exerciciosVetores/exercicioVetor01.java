package Arrays.exerciciosVetores;

import java.util.Arrays;
import java.util.Scanner;

public class exercicioVetor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce ira digitar?");
        int qtd = sc.nextInt();

        int[] vect = new int[qtd];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int j = 0; j < vect.length; j++) {
            if (vect[j] < 0) {
                System.out.println(vect[j]);
            }
        }

        System.out.println(Arrays.toString(vect));


        sc.close(); 
    }
}

