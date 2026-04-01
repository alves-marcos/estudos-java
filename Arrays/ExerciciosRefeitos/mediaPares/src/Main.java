import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);



        System.out.print("Quantos elementos vai ter o vetor? ");
        int qtde = sc.nextInt();

        int[] vect = new int[qtde];


        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        ;
        double somaPares = 0;
        int contador = 0;

        for (int i = 0; i < vect.length; i++){
            if (vect[i] % 2 == 0){
                somaPares = somaPares + vect[i];
                contador++;
            }
        }

        if (somaPares == 0){
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double avg = somaPares/contador;
            System.out.printf("MEDIA DOS PARES = %.1f", avg);
        }





        sc.close();
    }
}