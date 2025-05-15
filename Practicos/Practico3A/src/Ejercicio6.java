/*
* 6. Encontrar el valor máximo de un vector
Usar recursión para hallar el valor máximo en un arreglo de enteros.
• Ejemplo: entrada: vector = {3, 9, 2, 5}, salida: 9
* */
public class Ejercicio6 {
    static int EncontrarValorMaximo(int[] v, int i,int maxActual){
        if (i == 0) return maxActual;
        if (maxActual < v[i]) maxActual = v[i];
        return EncontrarValorMaximo(v,i,maxActual);
    }

    public static void main(String[] args) {
        int[] v = {3,9,2,5};
        EncontrarValorMaximo(v,0,0);
    }
}
// v = {3, 9, 2, 5}
// Consola: EncontrarValorMaximo(v,v.length-1)
// 1. = 5;
// 1. =
