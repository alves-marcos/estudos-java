import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int qtde = sc.nextInt();

        int[] vect = new int[qtde];
        int[] copia = new int[qtde];

        for (int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS");
        for (int i = 0; i < vect.length; i++){
            if (vect[i] < 0) {
                System.out.println(vect[i]);
            }
        }

        System.out.println(Arrays.toString(vect));

        sc.close();
    }
}
