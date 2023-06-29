import java.util.Random;

public class Ejercicio 20 {
    public static void main(String[] args) {
        Random random = new Random();
        int contador = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        do {
            int numero = random.nextInt(100); // Genera un número aleatorio entre 0 y 99

            // Compara el número actual con el máximo y el mínimo actual
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }

            System.out.println("Número generado: " + numero);
            contador++;
        } while (contador < 10);

        System.out.println("El máximo número generado es: " + maximo);
        System.out.println("El mínimo número generado es: " + minimo);
    }
}