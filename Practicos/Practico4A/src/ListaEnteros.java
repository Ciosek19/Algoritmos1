public class ListaEnteros {
    private Nodo cabeza;
    private int tamanio;

    public ListaEnteros(){
        this.cabeza = null;
        tamanio = 0;
    }

    public boolean estaVacia(){
        return cabeza == null;
    }

    public int longitud() {
        return tamanio;
    }

    public void insertarAlIncio(int dato){
        Nodo nuevo = new Nodo(dato);
        if (this.estaVacia()) cabeza = nuevo;
        else {
            nuevo.setSiguiente(cabeza);
            cabeza = nuevo;
        }
        tamanio++;
    }

    public void imprimirLista(){
        Nodo aux = cabeza;
        int contador = 1;
        while (aux != null){
            System.out.println(contador + ". Dato: "+ aux.getValor());
            aux = aux.getSiguiente();
            contador++;
        }
    }

    // Practico 4A
}
