package iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;


public class bee1008 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int numero_funcionario = scanner.nextInt();
        int horas_trabalhadas = scanner.nextInt();
        double valor_hora = scanner.nextDouble();

        double salario = horas_trabalhadas * valor_hora;

        System.out.println("NUMBER = " + numero_funcionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        scanner.close();
    }
}