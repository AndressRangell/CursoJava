package Main;

import lista_doble_circular.ListaDobleCircular;
import lista_doble_enlazada.ListaDobleEnlazada;
import lista_enlazada.ListaEnlazada;
import lista_enlazada_ordenada.ListaEnlazadaOrdenada;

public class Main {
    
    public static void main(String[] args) {
        
        //listaEnlazada();
        
        //listaEnlazadaOrdenada();
        
        //listaDobleEnlazada();
        
        listaCircular();
        
    }

    private static void listaEnlazada() {
        ListaEnlazada lista = new ListaEnlazada();
        
        lista.agregarInicio(5);
        lista.agregarInicio(3);
        lista.agregarInicio(2);
        lista.agregarInicio(8);
        lista.agregarFinal(10);
        lista.agregarFinal(15);
        lista.eliminar(10);
        
        lista.verLista();
    }

    private static void listaEnlazadaOrdenada() {
        ListaEnlazadaOrdenada lista = new ListaEnlazadaOrdenada();
        
        lista.agregarOrdenado(4);
        lista.agregarOrdenado(3);
        lista.agregarOrdenado(7);
        lista.agregarOrdenado(5);
        
        lista.verLista();
    }

    private static void listaDobleEnlazada() {
        ListaDobleEnlazada lista = new ListaDobleEnlazada();
        
        lista.agregarInicio(4);
        lista.agregarFinal(9);
        lista.agregarInicio(1);
        lista.agregarFinal(8);
        lista.eliminarInicio();
        lista.eliminarFinal();
        
        lista.verLista();
    }

    private static void listaCircular() {
        ListaDobleCircular lista = new ListaDobleCircular();
        
        lista.agregar(5);
        lista.agregar(10);
        lista.agregar(15);
        lista.agregar(20);
        lista.eliminar(15);
        
        lista.verLista();
    }
    
}
