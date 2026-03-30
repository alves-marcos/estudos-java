package application;

import util.Circle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio do circulo:  ");
        double x = sc.nextDouble();

        double areaCirculo = Circle.area(x);

        System.out.printf("O circulo tem área de : %.2f%n", areaCirculo);

        sc.close();
    }
}
