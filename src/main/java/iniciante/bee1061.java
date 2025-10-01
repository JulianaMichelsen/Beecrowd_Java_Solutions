package iniciante;

import java.util.Scanner;


public class bee1061 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] diaInicio = scanner.nextLine().split(" ");
        int dia1 = Integer.parseInt(diaInicio[1]);

        String[] horarioInicio = scanner.nextLine().split(" : ");
        int horaInicio = Integer.parseInt(horarioInicio[0]);
        int minutoInicio = Integer.parseInt(horarioInicio[1]);
        int segundoInicio = Integer.parseInt(horarioInicio[2]);

        String[] diaFim = scanner.nextLine().split(" ");
        int dia2 = Integer.parseInt(diaFim[1]);

        String[] horarioFim = scanner.nextLine().split(" : ");
        int horaFim = Integer.parseInt(horarioFim[0]);
        int minutoFim = Integer.parseInt(horarioFim[1]);
        int segundoFim = Integer.parseInt(horarioFim[2]);

        scanner.close();

        int inicioSeg = dia1 * 24 * 3600 + horaInicio * 3600 + minutoInicio * 60 + segundoInicio;
        int fimSeg = dia2 * 24 * 3600 + horaFim * 3600 + minutoFim * 60 + segundoFim;

        int duracao = fimSeg - inicioSeg;

        int dias = duracao / (24 * 3600);
        duracao %= 24 * 3600;

        int horas = duracao / 3600;
        duracao %= 3600;

        int minutos = duracao / 60;
        int segundos = duracao % 60;

        System.out.printf("%d dia(s)\n", dias);
        System.out.printf("%d hora(s)\n", horas);
        System.out.printf("%d minuto(s)\n", minutos);
        System.out.printf("%d segundo(s)\n", segundos);

    }
}


