import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;


public class bee1006 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double media = ((A * 2) + (B * 3) + (C * 5)) / 10.0;

        System.out.printf("MEDIA = %.1f%n", media);

        scanner.close();
    }
}
