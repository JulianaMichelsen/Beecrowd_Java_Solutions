package iniciante;

import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;


public class bee1038 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        HashMap<Integer, Double> tabela = new HashMap<>();

        tabela.put(1, 4.00);
        tabela.put(2, 4.50);
        tabela.put(3, 5.00);
        tabela.put(4, 2.00);
        tabela.put(5, 1.50);

        int pedido = scanner.nextInt();
        int quantidade = scanner.nextInt();
        double total = 0;

        if (tabela.containsKey(pedido)){
            double preco = tabela.get(pedido);
            total = quantidade * preco;
            System.out.printf("Total: R$ %.2f%n", total);
        }

        scanner.close();
    }
}
