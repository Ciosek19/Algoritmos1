
//  Desarrollar una función que, dada cierta operación entre dos valores devuelva el
//  resultado correspondiente utilizando únicamente sumas y restas. No está
//  permitido el uso de operadores matemáticos directos distintos de + y – (adición y
//  sustracción).

//  La operación por realizar se indicará por medio de un tercer parámetro.
//  Si los valores no son adecuados para la operación solicitada, la función deberá
//  manejar dicha situación de forma apropiada.

public class Algoritmo {
    public static float Calculadora(int a, char op, int b){
        if (op != '-' && op != '+' && op != '/' && op != '*') return Float.NaN;

        switch (op){
            case '-':
                return (Utilidades.resta(a,b));
            case '+':
                return Utilidades.suma(a,b);
            case '/':
                if (b == 0) return Float.NaN;
                return Utilidades.division(a,b);
            case '*':
                return Utilidades.multiplicacion(a,b);
        }

    return Float.NaN;
    }
}