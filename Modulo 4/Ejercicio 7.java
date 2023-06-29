public class Ejercicio 7 {
    public static void main(String[] args) {
        int variable1 = 10;
        int variable2 = 5;
        int variable3 = 8;
        
        if (variable1 >= variable2 && variable1 >= variable3) {
            System.out.println("La variable mayor es: " + variable1);
        } else if (variable2 >= variable1 && variable2 >= variable3) {
            System.out.println("La variable mayor es: " + variable2);
        } else {
            System.out.println("La variable mayor es: " + variable3);
        }
    }
}