/*
Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.

Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos.
 */

package iniciante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;


public class bee1060 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        List<Double> positive = new ArrayList<>();
        List<Double> values = new ArrayList<>();
        

        for (int i = 0; i < 6; i++) {
            values.add(scanner.nextDouble());
        }
        
        for (Double x : values){
            if (x > 0){
                positive.add(x);
            }
        }

        System.out.println(positive.size() + " valores positivos");


        scanner.close();
    }
}

