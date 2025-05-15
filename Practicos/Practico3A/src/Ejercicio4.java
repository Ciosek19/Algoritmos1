/*
* 4. Suma de elementos de un vector
Crear una función recursiva que sume los elementos de un vector.
• Ejemplo: entrada: vector = {1, 2, 3, 4}, salida: 10
* */

public class Ejercicio4 {
    public static int sumaVector(int[] vector, int index){
        if (index == vector.length -1) return vector[index];
        else {
            return vector[index] + sumaVector(vector,index+1);
        }
    }

    public static int sumaVector2(int[] vector, int index){
        if (index == 0) return vector[index];
        else {
            return vector[index] + sumaVector(vector, index-1);
        }
    }
}
