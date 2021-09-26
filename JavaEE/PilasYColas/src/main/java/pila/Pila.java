package pila;

import nodo.Nodo;

public class Pila {
    
    private Nodo ultimo;
    private int tamano;
    
    public Pila(){
        this.ultimo = null;
        this.tamano = 0;
    }
    
    public void push(int dato){
        Nodo nuevo = new Nodo(dato);
        nuevo.siguiente = ultimo;
        ultimo = nuevo;
        tamano++;
    }
    
    public void pop(){
        ultimo = ultimo.siguiente;
        tamano--;
    }
    
    public void peek(){
        System.out.println("Último dato ingresado: " + ultimo.dato);
    }
    
    public void size(){
        System.out.println(tamano + " elementos en la pila");
    }
    
    public void clear(){
        while (ultimo != null) {            
            pop();
        }
    }
    
    public void verPila(){
        Nodo nodo = ultimo;
        while (nodo != null) {            
            System.out.print(nodo.dato);
            nodo = nodo.siguiente;
            if(nodo != null){
                System.out.print(" - ");
            }else{
                System.out.println("");
            }
        }
    }
    
}
