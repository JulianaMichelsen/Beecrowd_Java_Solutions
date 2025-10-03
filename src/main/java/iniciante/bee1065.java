/*
Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.
 */

package iniciante;

import java.util.Scanner;


public class bee1065 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        for (int i = 0; i < 5; i++) {
            int value = scanner.nextInt();
            if (value % 2 == 0) {
                count++;
            }
        }

        System.out.println(count + " valores pares");

        scanner.close();
    }
}


