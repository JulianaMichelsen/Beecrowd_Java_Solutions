/*
Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.
Entrada
A entrada será um valor inteiro positivo.
Saída
A saída será uma sequência de seis números ímpares.

 */
package iniciante;

import java.util.Scanner;

public class bee1070 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        for (int i = 0; i < 6; i++) {
            if (number % 2 != 0) {
                System.out.println(number);
                number++;
            } else {
                    number++;
                    i--;
            }


            scanner.close();
        }

    }
}


