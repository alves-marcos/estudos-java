import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int qtde = sc.nextInt();

        int[] vetorA = new int[qtde];
        int[] vetorB = new int[qtde];
        int[] vetorSoma = new int[qtde];

        System.out.print("Digite os valores do vetor A: ");
        System.out.println();
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor:");
            vetorA[i] = sc.nextInt();
        }

        System.out.print("Digite os valores do vetor B: ");
        System.out.println();
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor:");
            vetorB[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < vetorA.length; i++) {
            vetorSoma[i] = vetorA[i] + vetorB[i];
            System.out.println(vetorSoma[i]);

        }


        sc.close();
    }
}