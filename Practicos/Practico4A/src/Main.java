import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ListaEnteros lista = new ListaEnteros();
        lista.insertarDatoAlFinal(1);
        lista.insertarDatoAlFinal(2);
        lista.insertarDatoAlFinal(3);
        lista.insertarDatoAlFinal(4);
        lista.insertarDatoAlFinal(5);
        lista.imprimirLista();
        System.out.println("-------");

        ListaEnteros nuevaLista = lista.invertirDatos();
        System.out.println("Imprimiendo lista con datos invertidos");
        nuevaLista.imprimirLista();
        System.out.println("-----");
        System.out.println("Lista tiene los datos en ascendentes? "+ lista.estaAscendente());
        System.out.println("Lista invertida tiene los datos en ascendentes? "+ nuevaLista.estaAscendente());
        System.out.println("-----");
        System.out.println("El tamaño de la lista es "+lista.longitudIneficiente());
        System.out.println("-----");
        System.out.println("El maximo de la lista es "+lista.maximoDeLaLista());
        System.out.println("-----");
        System.out.println("El promedio de la lista es "+lista.promedioDeLaLista());
        System.out.println("-----");



    }
}