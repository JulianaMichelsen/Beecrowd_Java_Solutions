package iniciante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;


public class bee1051 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double salario = scanner.nextDouble();
        double isento = 2000.00;
        double imposto8;
        double imposto18;
        double imposto28;
        double saldo ;
        double impostoTotal;


        if (salario <= 2000.00){
            System.out.println("Isento");
        }
        else if (salario > 2000 && salario <= 3000.00) {
            saldo = salario - isento;
            imposto8 = saldo * 0.08;
            System.out.printf("R$ %.2f%n", imposto8);
        } else if (salario > 3000 && salario <= 4500.00) {
            imposto8 = 1000 * 0.08;
            saldo = salario - 3000.00;
            imposto18 = saldo * 0.18;
            impostoTotal = imposto8 + imposto18;
            System.out.printf("R$ %.2f%n", impostoTotal);
        } else{
            imposto8 = 1000 * 0.08;
            imposto18 = 1500 * 0.18;
            saldo = salario - 4500.00;
            imposto28 = saldo * 0.28;
            impostoTotal = imposto8 + imposto18 + imposto28;
            System.out.printf("R$ %.2f%n", impostoTotal);
        }
        scanner.close();

    }
}


