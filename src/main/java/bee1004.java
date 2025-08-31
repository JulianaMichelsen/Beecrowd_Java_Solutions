import java.io.IOException;
import java.util.Scanner;


public class bee1004 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int X = A * B;

        System.out.println("PROD = " + X);

        scanner.close();
    }
}
