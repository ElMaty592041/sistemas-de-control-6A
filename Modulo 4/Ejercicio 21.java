import java.util.Scanner;

public class Ejercicio 21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la categoría del empleado (A, B, C): ");
        String categoria = sc.nextLine();

        System.out.println("Ingrese la antigüedad del empleado en años: ");
        int antiguedad = sc.nextInt();

        System.out.println("Ingrese el sueldo bruto del empleado: ");
        double sueldoBruto = sc.nextDouble();

        double sueldoNeto = sueldoBruto;

        // Aplicar aumento según la antigüedad
        if (antiguedad >= 1 && antiguedad <= 5) {
            sueldoNeto += sueldoBruto * 0.05;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            sueldoNeto += sueldoBruto * 0.10;
        } else if (antiguedad > 10) {
            sueldoNeto += sueldoBruto * 0.30;
        }

        // Aplicar el plus por categoría
        if (categoria.equalsIgnoreCase("A")) {
            sueldoNeto += 1000;
        } else if (categoria.equalsIgnoreCase("B")) {
            sueldoNeto += 2000;
        } else if (categoria.equalsIgnoreCase("C")) {
            sueldoNeto += 3000;
        }

        System.out.println("El sueldo neto del empleado es: " + sueldoNeto);
    }
}