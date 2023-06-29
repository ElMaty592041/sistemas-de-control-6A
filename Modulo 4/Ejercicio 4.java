import java.util.Scanner;

public class Ejercicio 4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la categoría (a, b o c): ");
        String categoria = sc.nextLine().toLowerCase();

        String relacionFamiliar;

        switch (categoria) {
            case "a":
                relacionFamiliar = "hijo";
                break;
            case "b":
                relacionFamiliar = "padres";
                break;
            case "c":
                relacionFamiliar = "abuelos";
                break;
            default:
                relacionFamiliar = "Categoría inválida";
                break;
        }

        System.out.println("La relación familiar es: " + relacionFamiliar);
    }
}