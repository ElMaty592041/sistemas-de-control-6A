import java.util.Scanner;

public class Ejercicio 10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir los valores de las tres variables
        System.out.println("Ingresa el valor de la primera variable:");
        int variable1 = scanner.nextInt();

        System.out.println("Ingresa el valor de la segunda variable:");
        int variable2 = scanner.nextInt();

        System.out.println("Ingresa el valor de la tercera variable:");
        int variable3 = scanner.nextInt();

        // Encontrar el mayor de las tres variables usando el operador &&
        int mayor = variable1;
        if (variable2 > mayor && variable2 > variable3) {
            mayor = variable2;
        }
        if (variable3 > mayor && variable3 > variable2) {
            mayor = variable3;
        }

        // Imprimir el mayor de las tres variables
        System.out.println("El mayor de las tres variables es: " + mayor);
    }
}