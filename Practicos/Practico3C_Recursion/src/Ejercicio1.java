/*
* Implementar un algoritmo que convierta un número decimal (base 10) a su
representación en binario (base 2)
* */

public class Ejercicio1 {
    public static String DecimalABinario(int n){
        if (n <= 0) return "";
        if (n % 2 == 1) return DecimalABinario(n/2) + "1";
        return DecimalABinario(n / 2) + "0";
    }
}

/*
* Pila
* 23 / 2 = 11, Res 1
* 11 / 2 = 5, Res 1
* 5 / 2 = 2, Res 1
* 2 / 2 = 1, Res 0
* 1 / 2 = 0, Res 1
* Resultado = 10111
* */