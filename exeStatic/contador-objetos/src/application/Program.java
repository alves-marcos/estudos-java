package application;

import util.Product;

import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Product p1 = new Product("Marcos", 23);
        Product p2 = new Product("João", 25);
        Product p3 = new Product("Maria", 13);
        Product p4 = new Product("Zeze", 40);

        System.out.println("A primeira pessoa é: " + p1);
        System.out.println("A segunda pessoa é: " + p2);
        System.out.println("A terceira pessoa é: " + p3);
        System.out.println("A quarta pessoa é: " + p4);

        System.out.println("Total de produtos é: " + Product.totalProdutos);







        sc.close();
    }
}
