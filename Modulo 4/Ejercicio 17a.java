import java.util.Scanner;

public class Ejercicio 17a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la primera evaluación: ");
        double evaluacion1 = sc.nextDouble();
        
        System.out.println("Ingrese la segunda evaluación: ");
        double evaluacion2 = sc.nextDouble();
        
        System.out.println("Ingrese la tercera evaluación: ");
        double evaluacion3 = sc.nextDouble();
        
        double promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3;
        
        System.out.println("El promedio del alumno es: " + promedio);
        
        double sumaPares = 0;
        
        if (evaluacion1 % 2 == 0) {
            sumaPares += evaluacion1;
        }
        
        if (evaluacion2 % 2 == 0) {
            sumaPares += evaluacion2;
        }
        
        if (evaluacion3 % 2 == 0) {
            sumaPares += evaluacion3;
        }
        
        System.out.println("La suma de los valores pares es: " + sumaPares);
        
        if (promedio >= 7) {
            System.out.println("El alumno está aprobado.");
        } else {
            System.out.println("El alumno está reprobado.");
        }
    }
}