/*
    Desarrolle un metodo que recibiendo el costo de la hora de administración y el costo de la hora de taller imprima por pantalla el costo de producción de los modelos A y B por terminación y el total según el siguiente formato.

    Analisis:
    Lavadoras
	Modelo A
	        - 400 unidades N
 			- 200 unidades L
 			- 50 unidades S

	Modelo B
	        - 300 unidades N
 			- 100 unidades L
 			- 30 unidades S
    Terminacion
        N = 25h taller y 1h administracion
        L = 30h taller y 1,2h administracion
        S = 33h taller y 1,3h administracion

1. Representar informacion
2. Metodo(costoHoraAdmin, costoHoraTaller) : sout(costoCadaLavarropaSegunModelo)

3. Metodo(costoHoraAdmin, costoHoraTaller) : sout(costoProduccionLavarropaPorTerminacion)

 */

import javax.smartcardio.TerminalFactory;

public class Ejercicio3 {
    static int[][] lavadoras = {
            {400,200,50}, // Modelo A
            {300,100,30} // Modelo B
    };

    static char[] term = {'N','L','S'};

    static char[] modelos = {'A','B'};


    public static void imprimirInformacion(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Modelo "+modelos[i]);
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Terminacion "+ term[j] +" : "+matriz[i][j]+" unidades");
            }
            System.out.println("-------------------------");
        }
    }

    public static void costeDeHoras(int[][] matriz,float costeHoraTaller,float costeHoraAdmin){
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Modelo "+modelos[i]);
            for (int j = 0; j < matriz[i].length; j++) {
                // horasTaller * unides * costeHora
                System.out.println("Terminacion "+term[j]);
                System.out.println("Coste taller: "+costeHoraTaller*25*400);
                System.out.println("Coste administracion: "+costeHoraAdmin*1*400);
                System.out.println();
            }
            System.out.println("-------------------------");
        }
    }

    public static void main(String[] args) {
        costeDeHoras(lavadoras,5,5);
    }
}