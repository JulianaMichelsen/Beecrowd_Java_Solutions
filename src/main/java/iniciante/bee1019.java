package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class bee1019 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int tempo = scanner.nextInt();

        int horas = tempo / 3600;
        tempo = tempo % 3600;
        int minutos = tempo / 60;
        int segundos = tempo % 60;

        System.out.println(horas+":"+minutos+":"+segundos);

        scanner.close();
    }
}