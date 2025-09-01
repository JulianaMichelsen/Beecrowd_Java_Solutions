import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class bee1017 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int tempo = scanner.nextInt();
        int velocidade_media = scanner.nextInt();

        int distancia_percorrida = tempo * velocidade_media;
        double combustivel = distancia_percorrida / 12.0;
        System.out.printf("%.3f%n", combustivel);

        scanner.close();
    }
}


