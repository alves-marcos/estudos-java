package application;

import java.util.Scanner;

import entities.Funcionarios;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;

public class Program {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionarios> list = new ArrayList<Funcionarios>();

        System.out.print("How many employees will be registered? ");
        int qtdFunc = sc.nextInt();

        for (int i = 0; i < qtdFunc; i++) {
            System.out.println();
            System.out.println("Emplyoee #" + (i + 1));
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Funcionarios func = new Funcionarios(id, name, salary);

            list.add(func);
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int idSalary = sc.nextInt();

        Integer pos = position(list, idSalary);
        if (pos == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
        }


        sc.close();
    }

    public static Integer position(List<Funcionarios> list1, int id) {
        for (int i = 0; i < list1.size();i++){
           if (list1.get(i).getId()  == id){
               return  i;
           }
        }
        return null;
    }
}
