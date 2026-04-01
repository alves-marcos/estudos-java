import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double somaValores = 0.0;

        System.out.print("Quantos elementos vai ter o vetor? ");
        int qtde = sc.nextInt();

        double[] vetor = new double[qtde];

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            somaValores = somaValores + vetor[i];
        }

        double avg = somaValores / vetor.length;

        System.out.printf("MEDIA DO VETOR = %.3f", avg);
        System.out.println();
        System.out.println("ELEMENTOS ABAIXO DA MEDIA");
        for (int i = 0; i < vetor.length; i++){
            if(vetor[i] < avg){
                System.out.println(vetor[i]);
            }
        }


        sc.close();
    }
}