package application;

import util.SalaryCalculator;

import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o salario: ");
        double salary = sc.nextDouble();

        System.out.print("Digite a porcentagem de aumento: ");
        double percentage = sc.nextDouble();

        double resul = SalaryCalculator.calculatorSalary(salary,percentage);

        System.out.printf("O novo salário com aumento é: %.2f%n",resul);



        sc.close();
    }
}
