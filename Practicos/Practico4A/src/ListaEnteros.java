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
            tamanio--;
        }
    }

    public ListaEnteros retornarCola() {
        ListaEnteros nuevaLista = new ListaEnteros();
        if (this.estaVacia()) return nuevaLista;
        Nodo aux = this.cabeza.getSiguiente();
        nuevaLista.cabeza = aux;
        nuevaLista.tamanio = this.tamanio-1;
        return nuevaLista;
    }

    public void insertarDatoAlFinal(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        if (this.estaVacia()){
            this.cabeza = nuevoNodo;
        }
        else {
            Nodo aux = this.cabeza;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevoNodo);
        }
        tamanio++;
    }

/*
    5. Crear una función que retorne la lista con los datos invertidos.
    6. Crear una función booleana que retorne true si la lista esta ordenada ascendentemente.
    7. Crear una función que cuenta la lista ineficientemente.
    8. Crear función que retorne el valor máximo de la vista.
    9. Crear función que retorne el promedio de la lista.
    10. Crear función que retorne nueva lista: (int a, int b) que los que tengan valor "a" los reemplaze por el valor de "b".
*/
    public ListaEnteros invertirDatos(){
        ListaEnteros nuevaLista = new ListaEnteros();
        Nodo aux = this.cabeza;
        while(aux != null){
            nuevaLista.insertarAlIncio(aux.getValor());
            aux = aux.getSiguiente();
        }
        return nuevaLista;
    }

    public boolean estaAscendente(){
        if (this.estaVacia()) return false;
        if (this.tamanio < 2) return true;
        Nodo aux = this.cabeza;
        int valorMax = aux.getValor();
        while(aux.getSiguiente() != null){
            valorMax = aux.getValor();
            if (valorMax < aux.getSiguiente().getValor()){
                valorMax = aux.getSiguiente().getValor();
            }
            else{
                return false;
            }
            aux = aux.getSiguiente();
        }
        return true;
    }

    public int longitudIneficiente(){
        if (this.estaVacia()) return 0;
        int contador = 0;
        Nodo aux = this.cabeza;
        while(aux != null){
            aux = aux.getSiguiente();
            contador++;
        }
        return contador;
    }

    public int maximoDeLaLista(){
        if (this.estaVacia()) return 0;
        Nodo aux = this.cabeza;
        int valorMax = 0;

        while(aux != null){
            if (valorMax < aux.getValor()){
                valorMax = aux.getValor();
            }
            aux = aux.getSiguiente();
        }
        return valorMax;
    }

    public float promedioDeLaLista(){
        if (this.estaVacia()) return 0;
        Nodo aux = this.cabeza;
        int sumador = 0;
        while (aux != null){
            sumador += aux.getValor();
            aux = aux.getSiguiente();
        }
        return (float) sumador /tamanio;
    }

    public void reemplazarValores(int a, int b){
        if (this.estaVacia()) System.out.println("La lista esta vacia");
        else {
            Nodo aux = this.cabeza;
            while(aux != null){
                if (aux.getValor() == a){
                    aux.setValor(b);
                }
                aux = aux.getSiguiente();
            }
        }
    }
}
