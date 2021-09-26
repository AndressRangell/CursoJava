package cola;

import nodo.Nodo;

public class Cola {
    
    private Nodo primero;
    private Nodo ultimo;
    private int tamano;
    
    public Cola(){
        this.primero = this.ultimo = null;
        this.tamano = 0;
    }
    
    public void push(int dato){
        Nodo nuevo = new Nodo(dato);
        if(primero == null){
            primero = nuevo;
        }else{
            ultimo.siguiente = nuevo;
        }
        ultimo = nuevo;
        tamano++;
    }
    
    public void pop(){
        primero = primero.siguiente;
        tamano--;
    }
    
    public void peek(){
        System.out.println("Último dato ingresado: " + ultimo.dato);
    }
    
    public void size(){
        System.out.println(tamano + " elementos en la cola");
    }
    
    public void clear(){
        while (primero != null) {            
            pop();
        }
    }
    
    public void verPila(){
        Nodo nodo = primero;
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
