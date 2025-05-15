/**
 * 2. Factorial de un número
 * Implementar una función recursiva que calcule el factorial de un número n.
 • Ejemplo: factorial(5) → 120
 * */

public class Ejercicio2 {
    public static int factorial(int numero){
        if (numero == 1) return 1;
        return numero * factorial(numero - 1);
    }

    public static void main(String[] args) {
        factorial(5);
    }
}
