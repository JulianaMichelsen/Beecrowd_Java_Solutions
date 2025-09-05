package iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;


public class bee1041 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double coordenadaX = scanner.nextDouble();
        double coordenadaY = scanner.nextDouble();

        if (coordenadaX == 0 && coordenadaY == 0) {
            System.out.println("Origem");
        } else if (coordenadaX == 0) {
            System.out.println("Eixo Y");
        } else if (coordenadaY == 0) {
            System.out.println("Eixo X");
        } else if (coordenadaX > 0 && coordenadaY > 0) {
            System.out.println("Q1");
        } else if (coordenadaX < 0 && coordenadaY > 0) {
            System.out.println("Q2");
        } else if (coordenadaX < 0 && coordenadaY < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

        scanner.close();
    }
}



