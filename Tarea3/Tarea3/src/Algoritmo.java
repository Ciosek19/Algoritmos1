public class Algoritmo {
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

    public static int contadorIslas(int[][] v, int i, int j) {
        if (i == v.length) return 0;
        if (j == v[i].length) return contadorIslas(v, i + 1, 0);

        if (v[i][j] == 1) {
            desmarcarIsla(v,i,j);
            //Empieza recorrido
            //Si no hay proximo moviemiento termina isla y contador + 1
            return 1 + contadorIslas(v, 0, 0);
            }
        return contadorIslas(v, i, j + 1);
    }

    public static void desmarcarIsla(int[][] v, int i, int j) {
        if (i < 0 || j < 0 || i >= v.length || j >= v[i].length || v[i][j] == 0)
            return;

        v[i][j] = 0; // Marcar como visitado

        // Visitar en las 8 direcciones si hay tierra
        desmarcarIsla(v, i + 1, j); // Arriba
        desmarcarIsla(v, i - 1, j); // Abajo
        desmarcarIsla(v, i, j + 1); // Derecha
        desmarcarIsla(v, i, j - 1); // Izquierda
        desmarcarIsla(v, i + 1, j + 1); // Abajo derecha
        desmarcarIsla(v, i + 1, j - 1); // Abajo izquierda
        desmarcarIsla(v, i - 1, j + 1); // Arriba derecha
        desmarcarIsla(v, i - 1, j - 1); // Arriba izquierda
    }


    public static void main(String[] args) {
        System.out.println(contadorIslas(isla,0,0));
    }
}
//        Idea:
//        1. leemos un valor, buscamos en este orden: derecha,abajo,diagAD,diagAI
//        2. movemos a ese valor y el anterior lo reseteamos a 0, seguimos buscando
//        3. si no hay mas movimientos, contamos 1 isla.
//        4. buscamos proximo 1 desde el comienzo.
/*
    ContadorIslas(v,i,j):
    Si v[i][j] == 1
        v[i][j] = 0
        //Empieza recorrido
        Si ProximoMovimiento(v) == {0, 0}
            return 1 + ContadorIslas(0, 0);
        Sino
           ContadorIslas(v,proximoMoviemieto[0], proximoMoviemieto[1])
    Sino
        ContadorIslas(v,i,j+1)



    PILA -
    x. RecorreIsla(v,i=)
    ....
    12.RecorreIsla(v,i=5,j=6,contador 0,enisla true) == 1
    11.RecorreIsla(v,i=4,j=6,contador 0,enisla true) == 1
    10.RecorreIsla(v,i=3,j=7,contador 0,enisla true) == 1
    9. RecorreIsla(v,i=2,j=6,contador 0,enisla true) == 1
    8. RecorreIsla(v,i=2,j=5,contador 0,enisla true) == 1
    7. RecorreIsla(v,i=2,j=4,contador 0,enisla true) == 1
    6. RecorreIsla(v,i=1,j=4,contador 0,enisla true) == 1
    5. RecorreIsla(v,i=0,j=4,contador 0,enisla true) == 1
    4. RecorreIsla(v,i=0,j=3,contador 0,enisla false) == 1
    3. RecorreIsla(v,i=0,j=2,contador 0,enisla false) == 0
    2. RecorreIsla(v,i=0,j=1,contador 0,enisla false) == 0
    1. RecorreIsla(v,i=0,j=0,contador 0,enisla false) == 0

*/
