public class Ejercicio1 {
    public static String[][] personas = {
            {"Juan Rodriguez","Martin Ocampo"},
            {"Maria Perez", "Igancio Castillo"},
            {"Carla Gomez", "Ana Romero"},
    };

    public static void imprimirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz[i].length; i++) {
            for (int j = 0; j < matriz[j].length; j++) {
                System.out.print(matriz[i][j]+ "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        imprimirMatriz(personas);
    }
}
