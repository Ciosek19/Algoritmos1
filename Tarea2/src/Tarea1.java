import java.io.Console;
import java.util.Scanner;

public class Tarea1 {

    static Boolean turnoPlayer1 = true;
    static Scanner sc = new Scanner(System.in);

    static char[][] tateti = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'},
    };

    public static void Inicio()
    {
        System.out.println("/////// TATETI ///////\n");
        System.out.println("SELECCIONE UNA OPCION: ");
        System.out.println("1. Jugar ");
        System.out.println("2. Salir ");
        String opcion = "0";
        while (opcion.equals("0")){
            opcion = sc.nextLine();
            switch (opcion) {
                case "1":
                    Juego();
                    break;
                case "2":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    opcion = "0";
            }
        }
    }

    public static void Juego(){
        boolean juegoTerminado = false;
        while (!juegoTerminado){
            mostrarJuego();
            int[] posicion = {0,0};
            while (!validarJugada(posicion)){
                System.out.println("Jugada no valida");
                posicion = jugada();
            }
            System.out.println("Correcta");
        }
    }
    public static int[] jugada(){
        int[] jugada = new int[2];
        //Fila
        System.out.println("Ingrese fila: ");
        try {
            jugada[0] = Integer.parseInt(sc.nextLine());
        } catch(Exception e){
            jugada[0] = 0;
        }
        //Columna
        System.out.println("Ingrese columna: ");
        try {
            jugada[1] = Integer.parseInt(sc.nextLine());
        } catch(Exception e){
            jugada[1] = 0;
        }
        return jugada;
    }

    public static void mostrarJuego(){
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

    public static Boolean validarJugada(int[] jugada){
        return tateti[jugada[0]][jugada[1]] == '-';
    }

    public static Boolean validarFilasColumna(int fila, int columna){
        return fila <= tateti.length && columna <= tateti.length && fila > 0 && columna > 0;
    }

    public static Boolean ganoJugador(char letra){
        boolean gana = false;
        //Por filas
        for (int i = 0; i < tateti.length; i++) {
            if (tateti[i][0] == letra && tateti[i][1] == letra && tateti[i][2] == letra){
                return true;
            }
        }

        //Por columnas
        for (int i = 0; i < tateti.length; i++) {
            if (tateti[0][i] == letra && tateti[1][i] == letra && tateti[2][i] == letra){
                return true;
            }
        }

        //Por cruce 1
        if (tateti[0][0] == letra && tateti[1][1] == letra && tateti[2][2] == letra){
            return true;
        }

        //Por cruce 2
        int letras = 0;
        for (int i = 0; i < tateti.length; i++) {
            if (tateti[i][tateti.length-(i+1)] == letra) letras++;
            if (letras == 3) return true;
        }
        return gana;
    }


    public static void main(String[] args) {
        Inicio();
    }
}
/*
i = 1
i = 2
i = 3
[0][2] = .legnth - 1
[1][1] = .length - 2
[2][0] = .lenght - 3

    - | - | -
    - | - | -
    - | - | -

    0 | 1 | 2
    0 | 1 | 2
    0 | 1 | 2
 */