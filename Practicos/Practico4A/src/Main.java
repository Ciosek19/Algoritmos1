import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ListaEnteros lista = new ListaEnteros();

        lista.insertarAlIncio(1);
        lista.insertarAlIncio(4);
        lista.insertarAlIncio(10);
        lista.insertarAlIncio(117);
        lista.insertarAlIncio(18);
        lista.insertarAlIncio(15);

        lista.imprimirLista();

        System.out.println("Pertence el 1 al a lista? " + lista.pertenece(1));
        System.out.println("Pertence el 4 al a lista? " + lista.pertenece(4));
        System.out.println("Pertence el 15 al a lista? " + lista.pertenece(15));

        lista.eliminarPrimerElemento();
        System.out.println("Mostrando lista luego de eliminar");
        lista.imprimirLista();

        System.out.println("Mostrando lista nueva sin la cabeza");
        ListaEnteros nuevaLista = lista.retornarCola();
        nuevaLista.imprimirLista();

        System.out.println("Insertando dato al final:");
        lista.insertarDatoAlFinal(4);
        lista.imprimirLista();
    }
}