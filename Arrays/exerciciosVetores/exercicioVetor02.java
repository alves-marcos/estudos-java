package Arrays.exerciciosVetores;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class exercicioVetor02 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos número irá digitar? ");
        int num = sc.nextInt();

        double[] vetor = new double[num];

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        System.out.println("Valores = " + Arrays.toString(vetor));

        for (int x = 0; x < vetor.length; x++){
            System.out.printf("%.1f " , vetor[x]);
        }

        double soma = 0;

        for (int j = 0; j < vetor.length; j++){
            soma = soma + vetor[j];
        }
        System.out.println();
        System.out.print("SOMA = " + soma);

        System.out.println();

        double avg = soma / vetor.length;
        System.out.print("MEDIA = " +  avg);



        sc.close();
    }
}
