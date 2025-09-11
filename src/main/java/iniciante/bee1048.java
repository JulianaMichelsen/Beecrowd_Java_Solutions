package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class bee1048 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double salario = scanner.nextDouble();
        int percentual = 0;
        double reajuste = salario * ((double) percentual /100);
        double novoSalario = salario + reajuste;

        if (salario <= 400.00){
            percentual = 15;
            reajuste = salario * ((double) percentual /100);
            novoSalario = salario + reajuste;
        } else if (salario > 400 && salario <= 800.00) {
            percentual = 12;
            reajuste = salario * ((double) percentual /100);
            novoSalario = salario + reajuste;
        } else if (salario > 800 && salario <= 1200.00) {
            percentual = 10;
            reajuste = salario * ((double) percentual /100);
            novoSalario = salario + reajuste;
        } else if (salario > 1200 && salario <= 2000.00) {
            percentual = 7;
            reajuste = salario * ((double) percentual /100);
            novoSalario = salario + reajuste;
        } else percentual = 4;
            reajuste = salario * ((double) percentual /100);
            novoSalario = salario + reajuste;

        System.out.printf("Novo salario: %.2f%n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f%n", reajuste);
        System.out.println("Em percentual: " + percentual + " %");

        scanner.close();
    }
}

