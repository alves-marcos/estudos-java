package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos alunos serao digitados? ");
        int qtd = sc.nextInt();


        String[] name = new String[qtd];
        double[] notaA = new double[qtd];
        double[] notaB = new double[qtd];
        double[] soma = new double[qtd];


        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite nome, primeira e segunda nota do "  + (i + 1) + "º aluno: ");
            sc.nextLine();
            name[i] = sc.nextLine();

            notaA[i] = sc.nextDouble();
            notaB[i] = sc.nextDouble();

            soma[i] = (notaA[i] + notaB[i]) / 2;
        }

        System.out.println("ALUNOS APROVADOS");
        for (int i = 0 ; i < qtd; i++){
            if (soma[i] >= 6.0){
                System.out.println(name[i]);
            }

        }


        sc.close();
    }

}