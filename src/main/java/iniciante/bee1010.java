package iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;


public class bee1010 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        peca peca1 = new peca();
        peca peca2 = new peca();

        peca1.codigo=scanner.nextInt();
        peca1.quantidade=scanner.nextInt();
        peca1.valor=scanner.nextDouble();
        peca1.total = peca1.quantidade * peca1.valor;


        peca2.codigo=scanner.nextInt();
        peca2.quantidade=scanner.nextInt();
        peca2.valor=scanner.nextDouble();
        peca2.total = peca2.quantidade * peca2.valor;

        double soma = peca1.total + peca2.total;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", soma);

        scanner.close();
    }

    public static class peca{
        int codigo;
        int quantidade;
        double valor;
        double total;
    }
}
