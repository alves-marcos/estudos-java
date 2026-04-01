import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int qtd = sc.nextInt();

        int[] vetor =  new int[qtd];
        int maior = vetor[0];

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }


        int posicao = 0;

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > maior){
                maior = vetor[i];
                posicao = i;
            }
        }

        System.out.println("O maior valor é: " + maior);
        System.out.println("Ele está na posição: " + posicao);


        sc.close();
    }
}