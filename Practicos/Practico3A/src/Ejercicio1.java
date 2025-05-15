/*
* 1. Listar números
Implementa dos funciones recursivas que:
    1. Una que imprima los números desde n hasta 1 (orden descendente).
    2. Otra que imprima los números desde 1 hasta n (orden ascendente).
*/

public class Ejercicio1 {
    public static void imprimirDescendente(int numero) {
        if (numero == 1) System.out.println(numero);
        else {
            System.out.println(numero);
            imprimirDescendente(numero - 1);
        }
    }

    public static void imprimirAscendente(int numero) {
        if (numero == 1) System.out.println(numero);
        else {
            imprimirDescendente(numero - 1);
            System.out.println(numero);
        }
    }

    public static void main(String[] args) {
        imprimirAscendente(5);
        System.out.println("------------");
        imprimirDescendente(5);
    }
}
