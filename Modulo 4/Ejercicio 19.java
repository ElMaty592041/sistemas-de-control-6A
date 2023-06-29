import java.util.Random;

public class Ejercicio 19 {
    public static void main(String[] args) {
        // Inicializar variables
        int contador = 0;
        int suma = 0;
        double promedio;

        // Crear objeto Random
        Random random = new Random();

        // Ciclo while para generar y sumar 10 números al azar
        while (contador < 10) {
            int numero = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
            System.out.println("Número generado: " + numero);
            suma += numero;
            contador++;
        }

        // Calcular promedio
        promedio = (double) suma / 10;

        // Mostrar resultado
        System.out.println("La suma de los números es: " + suma);
        System.out.println("El promedio de los números es: " + promedio);
    }
}