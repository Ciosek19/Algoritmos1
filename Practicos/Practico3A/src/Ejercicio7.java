public class Ejercicio7 {
    public static String invertirCadena(String cadena, int i){
        if (i == cadena.length()-1) return cadena.charAt(i)+"";
        return invertirCadena(cadena, i+1) + cadena.charAt(i);
    }

    public static void main(String[] args) {
        String cadena = "hola";

        System.out.println(invertirCadena(cadena,0));
    }
    /*
    * f(hola) r: a -> a
    * f(hola) r: ... + l  -> a + l
    * f(hola) r: ... + o -> a + l + o
    * f(hola) r: ... + h -> a + l + o + h
    * */
}
