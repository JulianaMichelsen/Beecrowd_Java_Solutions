/*
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo,
sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.
Saída
Apresente a duração do jogo conforme exemplo abaixo.
 */

package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class bee1046 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int horaInicio = scanner.nextInt();
        int horaFinal = scanner.nextInt();

        if (horaInicio == horaFinal){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }else if (horaInicio < horaFinal){
            int duracao = horaFinal - horaInicio;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }else {
            int duracao = (24 - horaInicio) + horaFinal;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }

        scanner.close();
    }
}
