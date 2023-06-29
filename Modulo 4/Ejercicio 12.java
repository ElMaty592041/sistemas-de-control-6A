import java.util.Scanner;

public class Ejercicio 12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.println("Ingresa un número:");
        int numero = scanner.nextInt();

        // Determinar a qué docena pertenece el número utilizando operadores && y ||
        if (numero >= 1 && numero <= 12) {
            System.out.println("El número pertenece a la primera docena.");
        } else if (numero >= 13 && numero <= 24) {
            System.out.println("El número pertenece a la segunda docena.");
        } else if (numero >= 25 && numero <= 36) {
            System.out.println("El número pertenece a la tercera docena.");
        } else {
            System.out.println("El número " + numero + " está fuera de rango.");
        }
    }
}