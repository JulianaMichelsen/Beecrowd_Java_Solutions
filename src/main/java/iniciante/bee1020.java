package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class bee1020 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int idade_dias = scanner.nextInt();

        int anos = idade_dias / 365;
        idade_dias = idade_dias % 365;
        int meses = idade_dias / 30;
        int dias = idade_dias % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(meses + " meses(s)");
        System.out.println(dias + " dias(s)");

        scanner.close();
    }
}
