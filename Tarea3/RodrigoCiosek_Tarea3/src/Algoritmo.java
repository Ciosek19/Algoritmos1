public class Algoritmo {

    public static int algoritmo(int[][]m){
        if (validarMatriz(m) ){
            return contadorIslas(m,0,0);
       }
       return 0;
    }

    public static int contadorIslas(int[][] m, int i, int j) {
        if (i == m.length) return 0;
        if (j == m[i].length) return contadorIslas(m, i + 1, 0);

        // Si hay tierra
        if (m[i][j] == 1) {
            desmarcarIsla(m,i,j);

            return 1 + contadorIslas(m, 0, 0);
        }
        return contadorIslas(m, i, j + 1);
    }

    public static void desmarcarIsla(int[][] m, int i, int j) {
        if (i < 0 || j < 0 || i >= m.length || j >= m[i].length || m[i][j] == 0)
            return;

        m[i][j] = 0; // Marcamos 0 para indicar visitada

        desmarcarIsla(m, i + 1, j); // Arriba
        desmarcarIsla(m, i - 1, j); // Abajo
        desmarcarIsla(m, i, j + 1); // Derecha
        desmarcarIsla(m, i, j - 1); // Izquierda
        desmarcarIsla(m, i + 1, j + 1); // Abajo derecha
        desmarcarIsla(m, i + 1, j - 1); // Abajo izquierda
        desmarcarIsla(m, i - 1, j + 1); // Arriba derecha
        desmarcarIsla(m, i - 1, j - 1); // Arriba izquierda
    }

    public static boolean validarMatriz(int[][] m){
        if (m == null) return false;
        if (m.length < 1) return false;
        if (m[0].length < 2) return false;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] != 0 && m[i][j] != 1) return false;
            }
        }
        return true;
    }

}

