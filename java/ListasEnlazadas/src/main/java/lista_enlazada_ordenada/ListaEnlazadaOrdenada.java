package lista_enlazada_ordenada;

import nodo.Nodo;

public class ListaEnlazadaOrdenada {
    
    private Nodo primero;

    public ListaEnlazadaOrdenada(){
        this.primero = null;
    }
    
    public void agregarOrdenado(int dato){
        Nodo nuevo = new Nodo(dato);
        if(primero == null){
            primero = nuevo;
        }else if(dato < primero.dato){
            nuevo.siguiente = primero;
            primero = nuevo;
        }else{
            Nodo anterior;
            Nodo actual;
            anterior = actual = primero;
            while (actual.siguiente != null && dato > actual.dato) {
                anterior = actual;
                actual = actual.siguiente;
            }
            if(dato > actual.dato) anterior = actual;
            nuevo.siguiente = anterior.siguiente;
            anterior.siguiente = nuevo;
        }
    }
    
    public void verLista(){
        Nodo nodo = primero;
        while (nodo != null) {            
            System.out.print(nodo.dato);
            nodo = nodo.siguiente;
            if(nodo != null){
                System.out.print(" - ");
            }
        }
    }
    
}
