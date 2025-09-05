package iniciante;

import java.io.IOException;
import java.util.*;
import static java.lang.Math.pow;

public class bee1045 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        List<Double> lados = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            lados.add(scanner.nextDouble());
        }

        lados.sort(Collections.reverseOrder());

        double A = lados.get(0);
        double B = lados.get(1);
        double C = lados.get(2);

        if (A >= B + C) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (pow(A, 2) == pow(B, 2) + pow(C, 2)) {
                System.out.println("TRIANGULO RETANGULO");
            }
            if (pow(A, 2) > pow(B, 2) + pow(C, 2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }
            if (pow(A, 2) < pow(B, 2) + pow(C, 2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

        scanner.close();
    }
}
