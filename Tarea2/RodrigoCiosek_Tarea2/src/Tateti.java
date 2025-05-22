import java.util.Scanner;

public class Tateti {

    private static Boolean turnoPlayer1 = true;
    private static Scanner sc = new Scanner(System.in);

    private static final char[][] tateti = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'},
    };

    /* INTERACCION */
    public static void inicio()
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

    private static void Juego(){
        boolean juegoTerminado = false;
        int[] jugada = new int[2];
        char letra = 'X';
        // Mientras el juego siga
        while (!juegoTerminado){
            letra = turnoPlayer1 ? 'X' : 'O';
            //      Mostrar el juego
            mostrarJuego();

            //      Pedir jugada al usuario
            jugada = pedirJugada(turnoPlayer1);

            //      Validar jugada del usuario
            while(!validarJugada(jugada)){
                //      Si no es valida que ingrese devuelta
                System.out.println("Jugada no valida");
                mostrarJuego();
                jugada = pedirJugada(turnoPlayer1);

            }

            //      Ver si es el player1 o no para colocar las letras
            //      Modificar el tateti
            insertarJugada(jugada[0],jugada[1],letra);

            //      Ver si gano el juego o hubo empate
            //      Mostrar el resultado
            if (ganoJugador(letra)){
                juegoTerminado = true;
            } else if(huboEmpate()){
                juegoTerminado = true;
                letra = '-';
            }
            turnoPlayer1 = !turnoPlayer1;
       }
        mostrarJuego();
        darVeredicto(letra);
        inicio();
    }

    private static void mostrarJuego(){
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

    private static int[] pedirJugada(boolean turnoPlayer1){
        String jugador = turnoPlayer1 ? "Player1" : "Player2";
        int[] jugada = new int[2];
        System.out.println("Turno de "+jugador);
        //Fila
        System.out.println("Ingrese fila: ");
        try {
            jugada[0] = Integer.parseInt(sc.nextLine()) - 1;
        } catch(Exception e){
            jugada[0] = -1;
        }
        //Columna
        System.out.println("Ingrese columna: ");
        try {
            jugada[1] = Integer.parseInt(sc.nextLine()) - 1;
        } catch(Exception e){
            jugada[1] = -1;
        }
        //Por si desea salir
        System.out.println("Ingrese 's' si quiere salir: ");
        String salida = sc.nextLine().toLowerCase();
        if (salida.equals("s")) System.exit(0);

        return jugada;
    }

    /* VALIDACIONES */
    private static boolean validarFilasColumna(int fila, int columna){
        return fila <= tateti.length && columna <= tateti.length && fila >= 0 && columna >= 0;
    }

    private static boolean validarJugada(int[] jugada){
        return validarFilasColumna(jugada[0],jugada[1]) && tateti[jugada[0]][jugada[1]] == '-';
    }

    private static boolean huboEmpate(){
        boolean empate = true;
        for (int i = 0; i < tateti.length; i++) {
            for (int j = 0; j < tateti[i].length; j++) {
                if (tateti[i][j] == '-') {
                    return false;
                }
            }
        }
        return empate;
    }

    private static void insertarJugada(int fila, int columna,char letra){
        tateti[fila][columna] = letra;
    }


    private static boolean ganoJugador(char letra){
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

    private static void darVeredicto(char letra){
        if (letra == 'X') System.out.println("Player1 win");
        else if (letra == 'O') System.out.println("Player2 win");
        else System.out.println("Empate");
    }

}
