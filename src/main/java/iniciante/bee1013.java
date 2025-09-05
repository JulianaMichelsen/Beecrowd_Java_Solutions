package iniciante;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.abs;


public class bee1013 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int maior = Maior(A,B);
        maior = Maior(maior,C);

        System.out.println(maior + " eh o maior");

        scanner.close();
    }

    public static int Maior(int x, int y){
        return (x+y+abs(x-y))/2;

    }
}