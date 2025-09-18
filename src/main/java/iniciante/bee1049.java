package iniciante;

import java.io.IOException;
import java.util.Scanner;


public class bee1049 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        String especie = scanner.next();
        String classe = scanner.next();
        String dieta = scanner.next();
        String animal = "";

        animal = switch (especie) {
            case "vertebrado" -> switch (classe) {
                case "ave" -> switch (dieta) {
                    case "carnivoro" -> "aguia";
                    case "onivoro" -> "pomba";
                    default -> animal;
                };
                case "mamifero" -> switch (dieta) {
                    case "onivoro" -> "homem";
                    case "herbivoro" -> "vaca";
                    default -> animal;
                };
                default -> animal;
            };
            case "invertebrado" -> switch (classe) {
                case "inseto" -> switch (dieta) {
                    case "hematofago" -> "pulga";
                    case "herbivoro" -> "lagarta";
                    default -> animal;
                };
                case "anelideo" -> switch (dieta) {
                    case "hematofago" -> "sanguessuga";
                    case "onivoro" -> "minhoca";
                    default -> animal;
                };
                default -> animal;
            };
            default -> "";
        };

        System.out.println(animal);

        scanner.close();
    }
}

