package Arrays.Estudo02.application;

import Arrays.Estudo02.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length ; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++){
            sum += vect[i].getPrice();
        }

        double average = sum / vect.length;

        System.out.println("The average of all products is " + average);



        sc.close();
    }
}
