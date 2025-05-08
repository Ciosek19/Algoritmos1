/*
* Desarrolla dos métodos: uno para sumar matrices y otro para restarlas. Se debe recibir por parámetro dos matrices de iguales dimensiones y retornar la resultante,
* a) En caso de dimensiones inválidas, lanzar una excepción o retornar null con un mensaje explicativo.
* b) Crear un metodo auxiliar para imprimir matrices. c) Probar ambos métodos con matrices de dimensiones: • 3x4 • 5x4 • 4x4.
 * */

public class Ejercicio2 {
    public static int[][] sumaMatrices(int[][] a, int[][] b){
        int[][] aux = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                aux[i][j] = a[i][j] + b[i][j];
            }
        }
        return aux;
    };

    public static void imprimirMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matriz1 = {{1, 2, 3},{4,5,6},{7,8,9}};
        int[][] matriz2 = {{1, 2, 3},{4,5,6},{7,8,9}};

        int[][] matriz3 = Ejercicio2.sumaMatrices(matriz1,matriz2);
        Ejercicio2.imprimirMatriz(matriz3);
    }

}
