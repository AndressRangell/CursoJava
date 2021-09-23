package lista_enlazada;

import nodo.Nodo;

public class ListaEnlazada {
    
    private Nodo primero;
    private Nodo ultimo;
    
    public ListaEnlazada(){
        this.primero = null;
    }
    
    public void agregarInicio(int dato){
        Nodo nuevo = new Nodo(dato);
        if(primero == null){
            ultimo = nuevo;
        }
        nuevo.siguiente = primero;
        primero = nuevo;
    }
    
    public void agregarFinal(int dato){
        Nodo nuevo = new Nodo(dato);
        if(ultimo == null){
            ultimo = primero = nuevo;
        }
        ultimo.siguiente = nuevo;
        ultimo = nuevo;
    }
    
    public void eliminar(int dato){
        boolean encontrado = false;
        Nodo actual = primero;
        Nodo anterior = null;
        while(actual != null && !encontrado){
            encontrado = actual.dato == dato;
            if(!encontrado){
                anterior = actual;
                actual = actual.siguiente;
            }
        }
        if(actual != null){
            if(actual == primero) primero = actual.siguiente;
            else anterior.siguiente = actual.siguiente;
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
