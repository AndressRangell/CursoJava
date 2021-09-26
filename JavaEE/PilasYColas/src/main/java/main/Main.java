package main;

import cola.Cola;
import pila.Pila;

public class Main {
    
    public static void main(String[] args) {
        
        //pila();
        
        //cola();
        
        //Lista enlazada -> LinkedList
        //Pila -> Stack
        //Cola -> Queue
        
    }

    private static void pila() {
        Pila pila = new Pila();
        
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.pop();
        pila.verPila();
        pila.peek();
        pila.size();
        pila.clear();
        pila.verPila();
    }

    private static void cola() {
        Cola cola = new Cola();
        
        cola.push(1);
        cola.push(2);
        cola.push(3);
        cola.push(4);
        cola.pop();
        cola.verPila();
        cola.peek();
        cola.size();
        cola.clear();
        cola.verPila();
    }
    
}
