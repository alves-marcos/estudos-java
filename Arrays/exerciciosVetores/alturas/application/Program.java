package Arrays.exerciciosVetores.alturas.application;

import Arrays.exerciciosVetores.alturas.entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas irá inserir? ");
        int num = sc.nextInt();

        Pessoas[] pessoa = new Pessoas[num];

        for (int i = 0; i < pessoa.length; i++) {
            System.out.println("Dados da " + (i + 1) + "º pessoa");

            System.out.print("Digite o nome: ");
            sc.nextLine();
            String name = sc.nextLine();



            System.out.print("Digite a idade: ");
            int idade = sc.nextInt();

            System.out.print("Digite a altura: ");
            double altura = sc.nextDouble();

            pessoa[i] = new Pessoas(name, idade, altura);
        }

        double altmedia = 0;
        for (int j = 0; j < pessoa.length; j++){
            altmedia = altmedia + pessoa[j].getAltura();
        }

        double avg = altmedia / pessoa.length;
        System.out.printf("Altura média: %.2f", avg);
        System.out.println();


        double menor16 = 0;


        for(int x = 0 ; x < pessoa.length; x++){
            if (pessoa[x].getIdade() < 16){
                menor16 = menor16 + 1;
            }
        }

        double porcentagem = menor16 * 100 / pessoa.length;
        System.out.print("Pessoas com menos de 16 anos: " + porcentagem + "%");
        System.out.println();

        for (int i = 0; i < pessoa.length; i++){
            if (pessoa[i].getIdade() < 16){
                System.out.println(pessoa[i].getName());
            }
        }




        sc.close();
    }
}
