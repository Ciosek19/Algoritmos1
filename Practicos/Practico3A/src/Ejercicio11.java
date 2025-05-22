public class Ejercicio11 {
    public static Boolean esPalindromo(String palabra, int i, int j){

        if (i >= j) return true;
        if (palabra.charAt(i) != palabra.charAt(j)) return false;
        return esPalindromo(palabra, i+1, j-1);
    }

    public static void main(String[] args) {
        String palabra = "pedro";
        int indiceFinal = palabra.length() -1;

        System.out.println(palabra+" es palindromo? "+esPalindromo(palabra,0,indiceFinal));
    }

    /*
    f(rallar) r == r : true
    f(rallar) a == a : true
    f(rallar) l == l : true
    f(rallar) l == l : true
    f(rallar) a == a : true
    f(rallar) r == r : true
    * */
}
