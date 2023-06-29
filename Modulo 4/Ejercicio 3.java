import java.util.Scanner;

public class Ejercicio 3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del mes: ");
        String nombreMes = sc.nextLine().toLowerCase();

        int cantidadDias;

        switch (nombreMes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                cantidadDias = 31;
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                cantidadDias = 30;
                break;
            case "febrero":
                cantidadDias = 28;
                break;
            default:
                cantidadDias = -1;
                break;
        }

        if (cantidadDias != -1) {
            System.out.println("El mes " + nombreMes + " tiene " + cantidadDias + " días.");
        } else {
            System.out.println("Ingrese un nombre de mes válido.");
        }
    }
}