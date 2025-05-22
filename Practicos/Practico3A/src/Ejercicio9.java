public class Ejercicio9 {

    public static int sumarDigitosNumero(int numero){
        if (numero < 10) return numero;
        return (numero % 10) + sumarDigitosNumero(numero/10);
    }

    /*
    f(1) r: 1 + .. -> 1
    f(12) r: 2 + ... -> 2 + 1 = 3
    f(123) r: 3 + ...  3 + (2 + 1) = 6
    * */
}
