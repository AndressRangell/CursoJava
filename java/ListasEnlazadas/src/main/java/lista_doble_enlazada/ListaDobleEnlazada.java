package lista_doble_enlazada;

import nodo.Nodo;

public class ListaDobleEnlazada {
    
    private Nodo primero;
    private Nodo ultimo;
    private int tamano = 0;
    
    public ListaDobleEnlazada(){
        this.primero = null;
        this.ultimo = null;
    }
    
    public void agregarInicio(int dato){
        Nodo nuevo = new Nodo(dato);
        if(tamano == 0){
            primero = ultimo = nuevo;
        }else{
            nuevo.siguiente = primero;
            primero.anterior = nuevo;
            primero = nuevo;
        }
        tamano++;
    }
    
    public void agregarFinal(int dato){
        Nodo nuevo = new Nodo(dato);
        if(tamano == 0){
            primero = ultimo = nuevo;
        }else{
            nuevo.anterior = ultimo;
            ultimo.siguiente = nuevo;
            ultimo = nuevo;
        }
        tamano++;
    }
    
    public void verLista(){
        Nodo nodo = primero;
        while(nodo != null){
            System.out.print(nodo.dato);
            nodo = nodo.siguiente;
            if(nodo != null){
                System.out.print(" - ");
            }
        }
    }
    
}
