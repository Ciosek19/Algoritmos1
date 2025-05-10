public class Tarea1 {

    static Boolean turnoPlayer1 = true;


    static char[][] tateti = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'},
    };

    public static void mostrarJuego(){
        System.out.println(" TA-TE-TI ");
        for (int i = 0; i < tateti.length; i++) {
            for (int j = 0; j < tateti[i].length; j++) {
                if (j == 1){
                    System.out.print("| "+tateti[i][j]+" |");
                }
                else {
                    System.out.print(" "+tateti[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void insertarJugada(int fila, int columna,char letra){
        tateti[fila][columna] = letra;
    }

    public static Boolean validarJugada(int fila, int columna){
        return tateti[fila][columna] == '-';
    }

    public static Boolean ganoJugador(char letra){
        return false;
    }
/*
    - | - | -
    - | - | -
    - | - | -
 */
public static void main(String[] args) {
    mostrarJuego();
}
}
