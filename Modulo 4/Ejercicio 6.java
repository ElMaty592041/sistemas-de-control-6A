public class Ejercicio 6 {
    public static void main(String[] args) {
        int curso = 9; // Curso a verificar (puedes cambiar este valor)

        if (curso == 0) {
            System.out.println("Jardín de infantes.");
        } else if (curso >= 1 && curso <= 6) {
            System.out.println("Primaria.");
        } else if (curso >= 7 && curso <= 12) {
            System.out.println("Secundaria.");
        } else {
            System.out.println("Curso inválido.");
        }
    }
}