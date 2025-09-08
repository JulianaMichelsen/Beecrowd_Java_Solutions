/*
Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.
Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.
Entrada
Quatro números inteiros representando a hora de início e fim do jogo.
Saída
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .
 */

package iniciante;

import java.io.IOException;
import java.util.Scanner;

        public class bee1047 {

            public static void main(String[] args) throws IOException {

                Scanner scanner = new Scanner(System.in);

                int horaInicio = scanner.nextInt();
                int minutoInicio = scanner.nextInt();
                int horaFinal = scanner.nextInt();
                int minutoFinal = scanner.nextInt();

                int inicioEmMinutos = horaInicio * 60 + minutoInicio;
                int fimEmMinutos = horaFinal * 60 + minutoFinal;

                int duracao = fimEmMinutos - inicioEmMinutos;

                if (duracao <= 0) {
                    duracao += 24 * 60;
                }

                int horas = duracao / 60;
                int minutos = duracao % 60;

                System.out.println("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)");

                scanner.close();
            }
        }



