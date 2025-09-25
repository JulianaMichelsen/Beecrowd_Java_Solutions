package iniciante;

import java.io.IOException;
import java.util.Scanner;


public class bee1052 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        String month;

        switch (number) {
            case 1 -> month = "January";
            case 2 -> month = "February";
            case 3 -> month = "March";
            case 4 -> month = "April";
            case 5 -> month = "May";
            case 6 -> month = "June";
            case 7 -> month = "July";
            case 8 -> month = "August";
            case 9 -> month = "September";
            case 10 -> month = "October";
            case 11 -> month = "November";
            case 12 -> month = "December";
            default -> month = "Invalid month";
        }

        System.out.println(month);
        scanner.close();
    }
}
