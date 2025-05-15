/*
* 3. Sumatoria hasta n
Escribir una función recursiva que devuelva la suma de los números desde n hasta 0.
• Ejemplo: sumatoria(4), salida: 10
* */

public class Ejercicio3 {
    public static int sumatoria(int n){
        if (n == 1) return 1;
        return n + sumatoria(n-1);
    }
}
