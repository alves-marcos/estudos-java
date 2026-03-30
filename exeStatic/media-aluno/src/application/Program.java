package application;

import util.Media;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a PRIMEIRA nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a SEGUNDA nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a TERCEIRA nota: ");
        double nota3 = sc.nextDouble();

        double resultado = Media.media(nota1,nota2,nota3);

        System.out.printf("A média das notas é: %.2f%n", resultado);


        sc.close();
    }
}
