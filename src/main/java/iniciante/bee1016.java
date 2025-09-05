package iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;


public class bee1016 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int kmHora = scanner.nextInt();

        int minutos = kmHora * 2;

        System.out.println(minutos+" minutos");

        scanner.close();
    }
}