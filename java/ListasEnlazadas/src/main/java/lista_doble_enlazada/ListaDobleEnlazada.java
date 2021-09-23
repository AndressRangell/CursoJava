package lista_doble_enlazada;

import nodo.Nodo;

public class ListaDobleEnlazada {
    
    private Nodo primero;
    private Nodo ultimo;
    private int tamano = 0;
    
    public ListaDobleEnlazada(){
        this.primero = this.ultimo = null;
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
    
    public void eliminarInicio(){
        if(tamano > 0){
            if(tamano == 1){
                primero = ultimo = null;
            }else{
                primero.siguiente.anterior = null;
                primero = primero.siguiente;
            }
        }
    }
    
    public void eliminarFinal(){
        if(tamano > 0){
            if(tamano == 1){
                primero = ultimo = null;
            }else{
                ultimo.anterior.siguiente = null;
                ultimo = ultimo.anterior;
            }
        }
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
