public class Main {

    static int[][] isla = {
            {0, 0, 0, 1, 1, 0, 0, 0, 1, 0},
            {0, 0, 1, 0, 1, 0, 0, 0, 1, 1},
            {0, 1, 0, 0, 1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 1, 0, 1, 0, 1, 0, 0, 1},
            {0, 0, 1, 0, 0, 0, 1, 0, 0, 1},
            {0, 0, 1, 0, 0, 0, 1, 0, 0, 1},
            {0, 0, 0, 1, 1, 1, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 1, 1, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 1}
    };
    static int[][] isla2 = {};

    public static void main(String[] args) {
        System.out.println(Algoritmo.algoritmo(isla));
    }

    public int sumador(int[] v, int d, int h){
        if (d > h || v.length < 1 || h >= v.length) return 0;
        int suma = 0;
        for (int i = d; i <= h; i++) {
            suma += v[i];
        }
        return suma;
    }
}