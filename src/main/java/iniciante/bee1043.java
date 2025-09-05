package iniciante;/*
Timelimit: 1
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:
Perimetro = XX.X
Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem
Area = XX.X
Entrada
A entrada contém três valores reais.
Saída
O resultado deve ser apresentado com uma casa decimal.
 */

import java.io.IOException;
import java.util.*;


public class bee1043 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        double valorA = scanner.nextDouble();
        double valorB = scanner.nextDouble();
        double valorC = scanner.nextDouble();

        List<Double> medidas = new ArrayList<>();

        medidas.add(valorA);
        medidas.add(valorB);
        medidas.add(valorC);
        Collections.sort(medidas);


        if ((medidas.get(0)+medidas.get(1)) > medidas.get(2)){
            double perimetro = valorA + valorB + valorC;
            System.out.println("Perimetro = " + perimetro);
        }else {
            double area = ((valorA+valorB) * valorC)/2;
            System.out.println("Area = " + area);
        }

        scanner.close();
    }
}


