package iniciante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class bee1018 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();

        List<Integer> listaNotas = new ArrayList<>(Arrays.asList(100, 50, 20, 10, 5, 2, 1));

        System.out.println(valor);

        for (int nota : listaNotas) {
            int quantidade = valor/nota;
            valor = valor % nota;
            System.out.println(quantidade + " nota(s) de R$ " + nota +",00" );
        }

        scanner.close();
    }
}