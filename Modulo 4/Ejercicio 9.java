import java.util.Scanner;

public class Ejercicio 9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la elección del primer competidor
        System.out.println("Competidor 1: Ingresa tu elección (0: piedra, 1: papel, 2: tijera):");
        int eleccionCompetidor1 = scanner.nextInt();

        // Validar la elección del primer competidor
        if (eleccionCompetidor1 < 0 || eleccionCompetidor1 > 2) {
            System.out.println("Elección inválida para el competidor 1. Debe ser 0, 1 o 2.");
            return;
        }

        // Pedir la elección del segundo competidor
        System.out.println("Competidor 2: Ingresa tu elección (0: piedra, 1: papel, 2: tijera):");
        int eleccionCompetidor2 = scanner.nextInt();

        // Validar la elección del segundo competidor
        if (eleccionCompetidor2 < 0 || eleccionCompetidor2 > 2) {
            System.out.println("Elección inválida para el competidor 2. Debe ser 0, 1 o 2.");
            return;
        }

        // Determinar el ganador
        if ((eleccionCompetidor1 == 0 && eleccionCompetidor2 == 2) ||
                (eleccionCompetidor1 == 1 && eleccionCompetidor2 == 0) ||
                (eleccionCompetidor1 == 2 && eleccionCompetidor2 == 1)) {
            System.out.println("Competidor 1 es el ganador.");
        } else if ((eleccionCompetidor2 == 0 && eleccionCompetidor1 == 2) ||
                (eleccionCompetidor2 == 1 && eleccionCompetidor1 == 0) ||
                (eleccionCompetidor2 == 2 && eleccionCompetidor1 == 1)) {
            System.out.println("Competidor 2 es el ganador.");
        } else {
            System.out.println("Es un empate.");
        }
    }
}