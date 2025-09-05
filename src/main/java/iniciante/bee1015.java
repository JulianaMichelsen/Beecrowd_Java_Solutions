package iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;


public class bee1015 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double p1 = Math.pow((x2 - x1), 2);
        double p2 = Math.pow((y2 - y1), 2);

        double distancia = Math.sqrt(p1 + p2);

        System.out.printf("%.4f%n", distancia);

        scanner.close();
    }
}

