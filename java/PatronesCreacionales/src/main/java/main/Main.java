package main;

import abstract_factory.IComputador;
import abstract_factory.ITablet;
import abstract_factory.TiendaApple;
import abstract_factory.TiendaSamsung;
import factory_method.BurguerKing;
import factory_method.Hamburguesa;
import simple_factory.Pizza;
import simple_factory.Pizzeria;

public class Main {

    public static void main(String[] args) {
        
        //Patron Simple Factory
        //simpleFactory();
        
        //Patron Factory Method
        //factoryMethod();
        
        //Patrón Abstract Factory
        abstractFactory();
        
    }
    
    private static void simpleFactory(){
        //Pizzería se encarga de crear los objetos y lleva un control de ellos
        
        Pizzeria pizzeria = new Pizzeria();
        
        Pizza carne = pizzeria.pequeña("Carne");
        Pizza hawuaiana = pizzeria.mediana("Hawuaiana");
        Pizza pollo = pizzeria.grande("Pollo");
        
        System.out.println(carne);
        System.out.println(hawuaiana);
        System.out.println(pollo);
    }
    
    private static void factoryMethod(){
        //BurguerKing controla el tipo de objeto que se va a crear y como crearlos
        //Factory Method define un solo método para crear objetos
        
        BurguerKing burguer = new BurguerKing();
        
        Hamburguesa tradicional = burguer.crearHamburguesa("Tradicional");
        Hamburguesa ranchera = burguer.crearHamburguesa("Ranchera");
        Hamburguesa especial = burguer.crearHamburguesa("Especial");
        
        System.out.println(tradicional + " - " + tradicional.getClass().getSimpleName());
        System.out.println(ranchera + " - " + ranchera.getClass().getSimpleName());
        System.out.println(especial + " - " + especial.getClass().getSimpleName());
    }

    private static void abstractFactory() {
        //Abstract Factory define varios métodos para crear objetos en IFabrica
        //al retornar interfaces en IFabrica podemos crear cualquier tipo de objeto
        //En este ejemplo TiendaApple y TiendaSamsung son las fabricas de objetos
        
        TiendaApple apple = new TiendaApple();
        TiendaSamsung samsung = new TiendaSamsung();
        
        IComputador macbookPro = apple.crearComputador();
        ITablet ipad = apple.crearTablet();
        
        IComputador notebookPro = samsung.crearComputador();
        ITablet galaxyA7 = samsung.crearTablet();
    }
    
}