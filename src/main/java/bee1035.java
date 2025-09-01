import java.io.IOException;
import java.util.Scanner;

public class bee1035 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int valorA = scanner.nextInt();
        int valorB = scanner.nextInt();
        int valorC = scanner.nextInt();
        int valorD = scanner.nextInt();

        if (valorB>valorC && valorD>valorA && valorC+valorD>valorA+valorB && valorC>0 && valorD>0 && valorA%2==0){
            System.out.println("Valores aceitos");
        }else {
                System.out.println("Valores não aceitos");
            }


        scanner.close();
    }
}
