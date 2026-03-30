import entities.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Retangulo X;

        X = new Retangulo();

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da base: ");
        X.width = sc.nextDouble();
        System.out.print("Digite o valor da altura: ");
        X.height = sc.nextDouble();

        double areaX = X.area();
        double perimetro = X.perimetro();
        double diagonal = X.diagonal();

        System.out.printf("AREA = %.2f\n" , areaX);
        System.out.printf("PERIMETRO = %.2f\n", perimetro);
        System.out.printf("DIAGONAL = %.2f\n", diagonal);



        sc.close();
    }
}
