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
        int contador = 0;
        while (aux != null){
            if (contador == 0) System.out.print("Cabeza:"+ aux.getValor());
            else{
                System.out.print(" -> "+ aux.getValor());
            }
            aux = aux.getSiguiente();
            contador++;
        }
        System.out.println();
    }

    // Practico 4A
    /*
        1. Crear una función booleana "pertenece" para validar si existe un dato
        2. Crear una función que elimine el primer elemento "borrarInicio".
        3. Crear una función que se llame "retornarCola", que debe retornar una lista nueva con todos los datos menos la cabeza
        4. Crear una función para insertar un dato al final de la lista.
    */

    public boolean pertenece(int dato){
        if (this.estaVacia()) return false;
        Nodo aux = cabeza;
        while(aux != null){
            if (aux.getValor() == dato) return true;
            aux = aux.getSiguiente();
        }
        return false;
    }

    public void eliminarPrimerElemento(){
        if (this.estaVacia()) System.out.println("La lista esta vacia");
        else {
            Nodo aux = cabeza.getSiguiente();
            cabeza = aux;
        }
    }

    public ListaEnteros retornarCola() {
        if (this.estaVacia()) return null;
        ListaEnteros nuevaLista = new ListaEnteros();
        Nodo aux = this.cabeza.getSiguiente();
        while(aux != null){
            nuevaLista.insertarAlIncio(aux.getValor());
            aux = aux.getSiguiente();
        }
        return nuevaLista;
    }

    public void insertarDatoAlFinal(int dato){
        if (this.estaVacia()){
            insertarAlIncio(dato);
        }
        else {
            Nodo nuevoNodo = new Nodo(dato);
            Nodo aux = this.cabeza;
            while(aux != null){
                if (aux.getSiguiente() == null) {
                    aux.setSiguiente(nuevoNodo);
                }
                aux = aux.getSiguiente();
                System.out.println(aux.getValor());
            }
        }
    }
}
