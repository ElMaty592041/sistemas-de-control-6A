import java.util.Scanner;

public class EvaluacionesAlumno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la primera evaluación: ");
        double evaluacion1 = sc.nextDouble();

        System.out.println("Ingrese la segunda evaluación: ");
        double evaluacion2 = sc.nextDouble();

        System.out.println("Ingrese la tercera evaluación: ");
        double evaluacion3 = sc.nextDouble();

        double promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3;

        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}