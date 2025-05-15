/*
* 10. Serie de Fibonacci
Escribir una función recursiva que devuelva el n-ésimo número de la serie de
Fibonacci.
* */

public class Ejercicio10 {
    public static int fibonacci(int n){
        if (n <= 1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}
