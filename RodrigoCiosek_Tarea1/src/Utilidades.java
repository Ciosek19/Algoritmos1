public class Utilidades {

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        int resultado = 0;
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        for (int i = 0; i < absB; i++) {
            resultado += absA;
        }
        return Math.round(reglaDeLosSignos(a,b,resultado));
    }

    public static float division(int a, int b) {
        float resultado = 0;
        int resto = 0;
        int cociente = 0;
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        int restaA = absA;

        // Conseguir el cociente
        while (restaA >= absB) {
            restaA -= absB;
            cociente++;
        }
        resto = restaA;
        resultado = cociente;
        if (resto == 0) {
            return reglaDeLosSignos(a,b,resultado);
        }

        // Division Larga para conseguir el restante en decimal

        // 1. Conseguir el resto * 10
        int restoAux = resto;
        for (int i = 1; i < 10; i++) {
            resto += restoAux;
        }


        // 2. Conseguir el cuantas veces entra el divisor en el resto*10
        int restoDivLarga = 0;
        while (resto >= absB) {
            resto -= absB;
            restoDivLarga++;
        }

        //3. Convertir restoDivLarga a decimal
        float decimal = 0;
        for (int i = 0; i < restoDivLarga; i++) {
            decimal += 0.1f;
        }

        resultado += decimal;
        return reglaDeLosSignos(a,b,resultado);
    }

    public static float reglaDeLosSignos(float a, float b, float resultado){
        if (a < 0 && b < 0) return Math.abs(resultado);
        else if (a < 0 || b < 0) return resultado *-1;
        else return resultado;

    }
}
