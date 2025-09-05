package iniciante;

import java.io.IOException;
import java.util.Scanner;


public class bee1003 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int X = A + B;

        System.out.println("SOMA = " + X);

        scanner.close();
    }
}
