package iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;


public class bee1040 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double n4 = scanner.nextDouble();

        double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10.0;

        media = Math.floor(media * 10) / 10.0;

        System.out.printf("Media: %.1f%n", media);

        if (media >= 7.0){
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0){
            System.out.println("Aluno reprovado.");
        }else {
            System.out.println("Aluno em exame.");
            double nota_exame = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f%n",nota_exame);
            double media_exame = (media + nota_exame) / 2;

            if (media_exame >= 5.0){
                System.out.println("Aluno aprovado.");
            }else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f%n", media_exame);
        }

        scanner.close();
    }
}


