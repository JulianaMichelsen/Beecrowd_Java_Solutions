/*
Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares, quantos valores digitados foram ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha após cada uma.
 */

package iniciante;

import java.util.Scanner;


public class bee1066 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countEven = 0;
        int countOdd = 0;
        int countPositive = 0;
        int countNegative = 0;

        for (int i = 0; i < 5; i++) {
            int value = scanner.nextInt();
            if (value % 2 == 0) {
                countEven ++;
            }
            else {
                countOdd ++;
            }

            if (value > 0){
                countPositive ++;
            }
            else if (value < 0) {
                countNegative ++;
            }
        }

        System.out.println(countEven + " valor(es) par(es)");
        System.out.println(countOdd + " valor(es) impar(es)");
        System.out.println(countPositive + " valor(es) positivo(s)");
        System.out.println(countNegative + " valor(es) negativo(s)");

        scanner.close();
    }
}


