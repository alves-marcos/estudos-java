import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int cont = 0;

        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos numeros voce vai digitar? ");
        int qdte = sc.nextInt();

        int[] vect = new int[qdte];
        int[] vetorCopia = new int[qdte];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        for (int i = 0; i < vect.length; i++){
            if (vect[i] % 2 == 0){
                vetorCopia[i] = vect[i];
                cont++;
            }
        }

        System.out.println("NUMEROS PARES:");
        for (int i = 0; i < vetorCopia.length; i++){
            if (vetorCopia[i] != 0){
                System.out.print(vetorCopia[i] + " ");
            }
        }
        System.out.println();


        System.out.println("QUANTIDAD DE PARES : " +  cont);
        sc.close();
    }
}