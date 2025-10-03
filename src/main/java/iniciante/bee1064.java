/*
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos valores positivos digitados.
 */

package iniciante;

import java.util.Scanner;
import java.util.Locale;


public class bee1064 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int count = 0;
        double sum = 0;

        for (int i = 0; i < 6; i++) {
            double value = scanner.nextDouble();
            if (value > 0) {
                count++;
                sum += value;
            }
        }

        double average = sum / count;

        System.out.println(count + " valores positivos");
        System.out.printf("%.1f\n", average);


        scanner.close();
    }
}


