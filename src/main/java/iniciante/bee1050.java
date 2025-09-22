package iniciante;

import java.io.IOException;
import java.util.Scanner;


public class bee1050 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int ddd = scanner.nextInt();
        String destination;

        switch (ddd) {
            case 61 -> destination = "Brasilia";
            case 71 -> destination = "Salvador";
            case 11 -> destination = "Sao Paulo";
            case 21 -> destination = "Rio de Janeiro";
            case 32 -> destination = "Juiz de Fora";
            case 19 -> destination = "Campinas";
            case 27 -> destination = "Vitoria";
            case 31 -> destination = "Belo Horizonte";
            default -> destination = "DDD nao cadastrado";
        }

        System.out.println(destination);
        scanner.close();
    }
}

