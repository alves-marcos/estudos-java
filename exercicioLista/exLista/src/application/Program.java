package application;

import entities.Funcionarios;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        int qtdeFunc = sc.nextInt();

        List<Funcionarios> funcionarios = new ArrayList<>();

        for (int i = 0; i < qtdeFunc; i++) {
            System.out.println("Emplyoee " + (i + 1));

            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();


            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            funcionarios.add(new Funcionarios(id, name, salary));

        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int selecionado = sc.nextInt();
     




        System.out.println("List of employees:");
        System.out.println(Arrays.toString(funcionarios.toArray()));

        System.out.println("teste");




        sc.close();
    }
}
