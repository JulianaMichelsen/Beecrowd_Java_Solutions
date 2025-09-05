package iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

import static java.lang.Math.pow;

public class bee1036 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double valorA = scanner.nextDouble();
        double valorB = scanner.nextDouble();
        double valorC = scanner.nextDouble();

        double delta = pow(valorB, 2) - 4*(valorA * valorC);

        if(valorA == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        }else {
            double r1 = (-valorB + Math.sqrt(delta))/(2 * valorA);
            double r2 = (-valorB - Math.sqrt(delta))/(2 * valorA);

            System.out.printf("R1 = %.5f%n", r1);
            System.out.printf("R2 = %.5f%n", r2);
        }
        scanner.close();
    }
}
