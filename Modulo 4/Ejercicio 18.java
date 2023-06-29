public class Ejercicio 18 {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 10; numero++) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            System.out.println("---------------------------");
            
            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
            
            System.out.println();
        }
    }
}