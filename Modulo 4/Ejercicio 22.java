import java.util.Random;

public class Ejercicio 22 {
    public static void main(String[] args) {
        Random random = new Random();
        int contador = 0;

        while (contador < 10) {
            String categoria = generarCategoriaAleatoria();
            int antiguedad = generarAntiguedadAleatoria();
            double sueldoBruto = generarSueldoBrutoAleatorio();

            double sueldoNeto = calcularSueldoNeto(categoria, antiguedad, sueldoBruto);

            if (sueldoNeto >= 0) {
                System.out.println("Empleado " + (contador + 1));
                System.out.println("Categoría: " + categoria);
                System.out.println("Antigüedad: " + antiguedad + " años");
                System.out.println("Sueldo bruto: $" + sueldoBruto);
                System.out.println("Sueldo neto: $" + sueldoNeto);
                System.out.println("------------------------------------");
                contador++;
            }
        }
    }

    private static String generarCategoriaAleatoria() {
        String[] categorias = {"A", "B", "C"};
        int indice = (int) (Math.random() * categorias.length);
        return categorias[indice];
    }

    private static int generarAntiguedadAleatoria() {
        return (int) (Math.random() * 15) + 1;
    }

    private static double generarSueldoBrutoAleatorio() {
        return Math.random() * 10000;
    }

    private static double calcularSueldoNeto(String categoria, int antiguedad, double sueldoBruto) {
        double sueldoNeto = sueldoBruto;

        if (antiguedad >= 1 && antiguedad <= 5) {
            sueldoNeto += sueldoBruto * 0.05;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            sueldoNeto += sueldoBruto * 0.10;
        } else if (antiguedad > 10) {
            sueldoNeto += sueldoBruto * 0.30;
        }

        if (categoria.equalsIgnoreCase("A")) {
            sueldoNeto += 1000;
        } else if (categoria.equalsIgnoreCase("B")) {
            sueldoNeto += 2000;
        } else if (categoria.equalsIgnoreCase("C")) {
            sueldoNeto += 3000;
        }

        return sueldoNeto;
    }
}