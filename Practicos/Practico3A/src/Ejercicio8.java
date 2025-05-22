public class Ejercicio8 {
    public static int contarDigitos(int numero){
        if (numero < 10) return 1;
        return 1 + contarDigitos(numero/10);
    }

    public static void main(String[] args) {
        System.out.println("Cantidad de digitos: "+contarDigitos(8143));
    }

    /*
     * 4. f(8) r: 1
     * 3. f(81) r: 1
     * 2. f(814) r: 1
     * 1. f(8143) r: 1
     * */
}
