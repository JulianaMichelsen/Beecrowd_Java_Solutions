package iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;


public class bee1014 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int X = scanner.nextInt();
        double Y = scanner.nextDouble();

        double media = X / Y;

        System.out.printf("%.3f km/l%n", media);

        scanner.close();
    }
}
