import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class bee1021 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double valor = scanner.nextDouble();
        int centavos = (int) Math.round(valor * 100);

        List<Integer> listaNotas = new ArrayList<>(Arrays.asList(10000, 5000, 2000, 1000, 500, 200));
        List<Integer> listaMoedas = new ArrayList<>(Arrays.asList(100, 50, 25, 10, 5, 1));

        System.out.println("NOTAS:");
        for (int nota : listaNotas) {
            int quantidade = centavos / nota;
            centavos %= nota;
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidade, nota / 100.0);
        }

        System.out.println("MOEDAS:");
        for (int moeda : listaMoedas) {
            int quantidade = centavos / moeda;
            centavos %= moeda;
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidade, moeda / 100.0);
        }

        scanner.close();
    }
}
