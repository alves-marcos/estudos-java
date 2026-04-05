package Arrays.exerciciosVetores.pensionato.application;

import Arrays.exerciciosVetores.pensionato.entities.Pessoa;

import java.util.Scanner;



public class Program {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("How manu rooms will be rented? ");
        int qtde = scan.nextInt();
        scan.nextLine();

        Pessoa[] pessoa = new Pessoa[10];

        int[] numQuarto = new int[10];

        for (int i = 0; i < qtde; i++){
            System.out.println("Rent #" + (i + 1));
            System.out.print("Informe o nome do estudante: ");
            String name = scan.nextLine();

            System.out.print("Informe o email: ");
            String email = scan.nextLine();

            System.out.print("Informe o quarto: ");
            int quarto = scan.nextInt();
            scan.nextLine();

            pessoa[i] = new Pessoa(name, email);
            numQuarto[i] = quarto;
        }
        for (int i = 0; i < qtde - 1; i++){
            for (int j = i + 1; j < qtde; j++){
                if (numQuarto[i] > numQuarto[j]){

                    // troca os quartos
                    int tempQuarto = numQuarto[i];
                    numQuarto[i] = numQuarto[j];
                    numQuarto[j] = tempQuarto;

                    // troca as pessoas junto
                    Pessoa tempPessoa = pessoa[i];
                    pessoa[i] = pessoa[j];
                    pessoa[j] = tempPessoa;
                }
            }
        }

        for (int i = 0; i < qtde; i++){
            System.out.println("Name: " + pessoa[i].getName() + ", "+ "Email: " + pessoa[i].getEmail() + ", "+  "Room: " + numQuarto[i]);

        }




        scan.close();
    }
}
