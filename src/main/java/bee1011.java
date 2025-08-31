import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;


public class bee1011 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double pi = 3.14159;
        double raio = scanner.nextDouble();

        double volume = (4/3.0) * pi * (raio * raio * raio);

        System.out.printf("VOLUME = %.3f%n", volume);

        scanner.close();
    }

    public static class peca{
        int codigo;
        int quantidade;
        double valor;
        double total;
    }
}

