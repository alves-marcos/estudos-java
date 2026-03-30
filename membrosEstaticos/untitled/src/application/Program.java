package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;


public class Program {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double X = sc.nextDouble();

        double c = Calculator.circumference(X);
        double v = Calculator.volume(X);


        System.out.printf("The circumference is: %.2f%n", c);
        System.out.printf("The volume of the circumference is: %.2f%n", v);
        System.out.printf("The PI value: %.2f%n", Calculator.PI);



        sc.close();
    }

}
