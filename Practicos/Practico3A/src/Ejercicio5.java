/*
* 5. Contar cuántas veces aparece un número en un vector
Dado un vector de enteros y un valor x, contar cuántas veces aparece x usando
recursión.
• Ejemplo: entrada: vector = {1, 2, 2, 4}, x = 2, salida: 2
* */

public class Ejercicio5 {
    public static int contadorVector(int[] v, int i, int x){
        if (i == v.length) return 0;
        if (v[i] == x){
            return 1 + contadorVector(v,i+1,x);
        }
        return contadorVector(v,i+1,x);
    }

    static int[] v = {1,2,2,4};
    public static void main(String[] args) {
        System.out.println(contadorVector(v,0,2));
    }
}

// v[0] == 1
// v[1] == 2
// v[2] == 2
// v[3] == 4
