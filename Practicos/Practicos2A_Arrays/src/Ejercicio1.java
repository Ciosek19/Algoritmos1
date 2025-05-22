class CorreccionPractico2A {
    public static void main(String[] args) {
        String[][] nombr
        es = {{"Juan Rodriguez", "Martin Ocampo"},
                {"Maria Perez", "Ignacio Castillo"},
                {"Carla Gomez", "Ana Romero"}};

        imprimirMatriz(nombres);

    }

    //EJERCICIO 1
    public static void imprimirMatriz(String[][] matriz) {
        System.out.println("--------------------------------------");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(" | " + matriz[fila][col] + " | ");
            }
            System.out.println();
            System.out.println("--------------------------------------");
        }
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("--------------------------------------");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(" | " + matriz[fila][col] + " | ");
            }
            System.out.println();
            System.out.println("--------------------------------------");
        }
    }

    //EJERCICIO 2

    public static int[][] sumarMatrices(int[][] m1, int[][] m2) {
        //para la suma vamos a ejecutar a validacion desde el mismo metodo, retornando una matriz nula en caso de que
        //las matrices no superen las reglas de validacion
        if (!esMatrizValida(m1, m2)) {
            System.out.println("MATRICES DE TAMANIO INCORRECTO");
            return new int[0][0];
        }
        //suponiendo que las matrices son regulares
        int[][] resultado = new int[m1.length][m1[0].length];
        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[i].length; j++) {
                resultado[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return resultado;
    }

    public static int[][] restarMatrices(int[][] m1, int[][] m2) {
        //en este caso no vamos a suponer que son regulares,
        //por lo tanto no conocemos el tamano de los array (o columnas)
        //En la creacion declaramos la cantidad de filas (cuantos arrays va a tener nuestro array principal)
        int[][] resultado = new int[m1.length][];

        for (int i = 0; i < resultado.length; i++) {
            //en cada fila que iteramos, vamos a definir el tamano del array (cantidad de columnas, a partir
            // del tamano de la fila de m o n)
            resultado[i] = new int[m1[i].length];

            for (int j = 0; j < resultado[i].length; j++) {
                resultado[i][j] = m1[i][j] - m2[i][j];
            }
        }
        return resultado;
    }

    public static void ejecutarRestaMatriz(int[][] m1, int[][] m2) {
        //en este caso usaremos un metodo void que ejecutara la logica de validacion, y si es superada
        //la logica de la resta, para finalmente imprimir la matriz resutante, de esta manera
        //no es necesario retornar una matriz nula en el metodo de resta.
        if (!esMatrizValida(m1, m2)) System.out.println("MATRICES DE TAMANIO INCORRECTO");
        else {
            int[][] resultado = restarMatrices(m1, m2);
            imprimirMatriz(resultado);
        }
    }

    public static boolean esMatrizValida(int[][] m1, int[][] m2) {
        if (m1 == null || m2 == null) return false;
        if (m1.length != m2.length) return false;
        if (m1[0].length != m2[0].length) return false;
        return true;
    }

    //Ejercicio 4

    public static Resultado maximoMatriz(int[][] matriz) {
        Resultado resultados = new Resultado();
        resultados.setMaximo(matriz[0][0]);
        resultados.setFila(0);
        resultados.setColumna(0);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > resultados.getMaximo()) {
                    resultados.setMaximo(matriz[i][j]);
                    resultados.setFila(i);
                    resultados.setColumna(j);
                }
            }
        }
        System.out.println("La fila es: " + resultados.getFila());
        System.out.println("La Columna es: " + resultados.getColumna());
        return resultados;

    }
    public static Resultado minimoMatriz(int[][] matriz) {
        Resultado resultados = new Resultado();
        resultados.setMinimo(matriz[0][0]);
        resultados.setFila(0);
        resultados.setColumna(0);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < resultados.getMinimo()) {
                    resultados.setMaximo(matriz[i][j]);
                    resultados.setFila(i);
                    resultados.setColumna(j);
                }
            }
        }
        System.out.println("La fila es: " + resultados.getFila());
        System.out.println("La Columna es: " + resultados.getColumna());
        return resultados;

    }

    public static void imprimirFilaMaximo(int[][] matriz) {
        Resultado valores = maximoMatriz(matriz);
        int fila = valores.getFila();

        for (int c = 0; c < matriz[fila].length; c++) {
            System.out.print("|" + matriz[fila][c] + "|");
        }

    }

    public static void imprimirColumnaMinimo(int[][] matriz) {
        Resultado valores = minimoMatriz(matriz);
        int columna = valores.getColumna();

        for (int f = 0; f < matriz.length; f++) {
            System.out.println("|" + matriz[f][columna] + "|");
        }
    }


}
//clase para manipular los datos del ejercico 4
class Resultado {

    private int maximo;
    private int minimo;
    private int fila;
    private int columna;


    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

}
