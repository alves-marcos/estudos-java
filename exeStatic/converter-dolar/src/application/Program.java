package application;

import util.CurrencyConverter;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do dolar: ");
        double price = sc.nextDouble();

        System.out.print("Digite quanto irá comprar: ");
        double quantidade = sc.nextDouble();

        System.out.printf("O total é de:  %.2f%n", CurrencyConverter.converter(price,quantidade));

        sc.close();
    }
}
