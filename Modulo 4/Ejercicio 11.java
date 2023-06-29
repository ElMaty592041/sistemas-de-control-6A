import java.util.Scanner;

public class Ejercicio 11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un carácter
        System.out.println("Ingresa un carácter:");
        char caracter = scanner.next().charAt(0);

        // Verificar si el carácter es una vocal utilizando el operador ||
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'
                || caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U') {
            System.out.println("El carácter ingresado es una vocal.");
        } else {
            System.out.println("El carácter ingresado no es una vocal.");
        }
    }
}