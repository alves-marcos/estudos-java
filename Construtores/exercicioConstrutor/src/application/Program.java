package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Operation;


public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Operation op;

        System.out.print("Enter account number: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is the na initial deposit (y/n)? ");
        char selection = sc.next().charAt(0);

        if (selection == 'y'){
            System.out.print("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            op = new Operation(id, name, deposit);
        } else {
            op = new Operation(name, id);
        }
        System.out.println();
        System.out.println("Account data:");
        System.out.print(op);

        System.out.print("Enter a deposite value: ");
        double accountDeposit = sc.nextDouble();
        op.addAccount(accountDeposit);
        System.out.println("Updated account data:");
        System.out.print(op);

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        op.accountWithdrawal(withdraw);

        System.out.println("Updated account data:");
        System.out.print(op);

        sc.close();
    }
}
