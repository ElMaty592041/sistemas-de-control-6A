import java.util.Scanner;

public class Ejercicio 17b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la primera evaluación: ");
        double evaluacion1 = sc.nextDouble();

        System.out.println("Ingrese la segunda evaluación: ");
        double evaluacion2 = sc.nextDouble();

        System.out.println("Ingrese la tercera evaluación: ");
        double evaluacion3 = sc.nextDouble();

        // Cálculo del promedio
        double promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3;

        System.out.println("El promedio del alumno es: " + promedio);

        // Suma de valores pares
        double sumaPares = 0;

        // Iterar sobre las evaluaciones y sumar solo los valores pares
        for (double evaluacion : new double[]{evaluacion1, evaluacion2, evaluacion3}) {
            sumaPares += evaluacion % 2 == 0 ? evaluacion : 0;
        }

        System.out.println("La suma de los valores pares es: " + sumaPares);
    }
}