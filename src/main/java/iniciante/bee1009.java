package iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;


public class bee1009 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        String vendedor = scanner.next();
        double salario = scanner.nextDouble();
        double vendas = scanner.nextDouble();

        double comissao = vendas * 0.15;
        double total = comissao + salario;

        System.out.printf("TOTAL = R$ %.2f%n", total);

        scanner.close();
    }
}
