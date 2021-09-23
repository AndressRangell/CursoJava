package lista_doble_circular;

import nodo.Nodo;

public class ListaDobleCircular {
    
    private Nodo primero;
    private Nodo ultimo;
    private int tamano = 0;
    
    public ListaDobleCircular(){
        primero = ultimo = null;
    }
    
    public void agregar(int dato){
        Nodo nuevo = new Nodo(dato);
        if(primero == null){
            primero = nuevo;
            primero.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
        }else{
            ultimo.siguiente = nuevo;
            nuevo.siguiente = primero;
            nuevo.anterior = ultimo;
            ultimo = nuevo;
            primero.anterior = ultimo;
        }
    }
    
    public void eliminar(int dato){
        Nodo actual = primero;
        Nodo anterior = ultimo;
        do {            
            if(actual.dato == dato){
                if(actual == primero){
                    primero = primero.siguiente;
                    ultimo.siguiente = ultimo;
                    primero.anterior = ultimo;
                }else if(actual == ultimo){
                    ultimo = anterior;
                    primero.siguiente = ultimo;
                    ultimo.siguiente = primero;
                }else{
                    anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = anterior;
                }
            }
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != primero);
    }
    
    public void verLista(){
        Nodo nodo = primero;
        do{
            System.out.print(nodo.dato);
            nodo = nodo.siguiente;
            if(nodo != primero){
                System.out.print(" - ");
            }
        }while(nodo != primero);
    }
    
}
