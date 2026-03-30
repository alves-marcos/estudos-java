package application;

import util.TemperatureConverter;

import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da temperature em Celcius: ");
        double celcius = sc.nextDouble();

        double convertido = TemperatureConverter.converter(celcius);

        System.out.println(convertido);


        sc.close();
    }
}
