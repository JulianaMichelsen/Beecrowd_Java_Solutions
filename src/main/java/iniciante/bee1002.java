package iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;


public class bee1002 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double pi = 3.14159;
        double raio = scanner.nextDouble();

        double area = pi * (raio * raio);

        System.out.printf("A=%.4f%n", area);

        scanner.close();
    }
}