import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double soma = 0.0;


        System.out.print("Quantos Nº irá digitar: ");
        int qtd =  sc.nextInt();

        double[] vetor = new double[qtd];

        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
        }

        for (int j = 0; j < vetor.length; j++){
            soma = soma +  vetor[j];
        }

        double media = soma / vetor.length;

        System.out.printf("VALORES = ");
        for (int h = 0; h < vetor.length; h++){
            System.out.print(vetor[h] + ", ");
        }
        System.out.println();


        System.out.printf("SOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f", media);



        sc.close();
    }
}
