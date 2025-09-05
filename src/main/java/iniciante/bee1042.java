package iniciante;

import java.io.IOException;
import java.util.*;


public class bee1042 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        List <Integer> lista = new ArrayList<>();

        int valor1 = scanner.nextInt();
        int valor2 = scanner.nextInt();
        int valor3 = scanner.nextInt();

        lista.add(valor1);
        lista.add(valor2);
        lista.add(valor3);

        List <Integer> listaOrdenada = new ArrayList<>(lista);
        Collections.sort(listaOrdenada);

        for(int num : listaOrdenada){
            System.out.println(num);
        }

        System.out.println();

        for(int num : lista){
            System.out.println(num);
        }

        scanner.close();
    }
}


