/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
 indicando se os valores lidos são múltiplos entre si.
Entrada
A entrada contém valores inteiros.
Saída
A saída deve conter uma das mensagens conforme descrito acima.
 */

package iniciante;


import java.io.IOException;
import java.util.Scanner;


public class bee1044 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();

        if (((valorA % valorB) == 0) || ((valorB % valorA) == 0)) {
            System.out.println("Sao Multiplos");
        }else {
            System.out.println("Nao sao Multiplos");
        }


        scanner.close();
    }
}


