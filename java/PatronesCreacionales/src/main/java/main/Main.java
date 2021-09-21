package main;

import abstract_factory.IComputador;
import abstract_factory.ITablet;
import abstract_factory.TiendaApple;
import abstract_factory.TiendaSamsung;
import builder.Usuario;
import factory_method.BurguerKing;
import factory_method.Hamburguesa;
import prototype.HotDog;
import simple_factory.Pizza;
import simple_factory.Pizzeria;
import singleton.Conexion;

public class Main {

    public static void main(String[] args) {
        
        //Patron Simple Factory
        //simpleFactory();
        
        //Patron Factory Method
        //factoryMethod();
        
        //Patrón Abstract Factory
        //abstractFactory();
        
        //Patrón Singleton
        //singleton();
        
        //Patrón Builder
        //builder();
        
        //Patrón Prototype
        //prototype();
        
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

    private static void singleton() {
        //Singleton nos ayuda a crear una instancia única en todo el programa
        //la única excepción es si crea la conexión en otro hilo diferente
        //usamos synchronized para crear una conexión única incluso en otros hilos
        
        Conexion conexion1 = Conexion.conectar();
        System.out.println("Código de conexion1: " + conexion1.hashCode());
        Conexion conexion2 = Conexion.conectar();
        System.out.println("Código de conexion2: " + conexion2.hashCode());
        
        //probamos creando la conexión en otros hilos
        Thread hilo1 = new Thread(() -> {
            Conexion conexion3 = Conexion.conectar();
            System.out.println("Código de conexion3: " + conexion3.hashCode());
        });
        
        Thread hilo2 = new Thread(() -> {
            Conexion conexion4 = Conexion.conectar();
            System.out.println("Código de conexion4: " + conexion4.hashCode());
        });
        
        hilo1.start();
        hilo2.start();
        
    }

    private static void builder() {
        //Permite crear objetos con los atributos que queramos construir
        //además permite habilitar atributos con las condiciones deseadas
        
        Usuario jhoan = Usuario.make("Jhoan", "Rangel")
                .setContacto(true)
                .setDireccion("Calle 15")
                .setTelefono(6407609)
                .setEmail("jhoan@gmail.com")
                .build();
        
        System.out.println(jhoan);
    }
    
    private static void prototype(){
        //Permite crear un prototipo de objeto para crear objetos casi identicos
        //nos sirve cuando necesitamos crear objetos parecidos de forma rápida
        
        HotDog perroBase = new HotDog("sencilla", "cola", "con todas las salsas", true, true);
        
        //Creamos un perro con salchicha americana
        HotDog perroAmericano = new HotDog(perroBase);
        perroAmericano.setSalchicha("Americana");
        
        //Creamos un perro sencillo sin cebolla
        HotDog perroSinCebolla = new HotDog(perroBase);
        perroSinCebolla.setCebolla(false);
        
        //Creamos un perro con gaseosa coca-cola y sin salsas
        HotDog perroSinSalsasConCocaCola = new HotDog(perroBase);
        perroSinSalsasConCocaCola.setSaborGaseosa("Coca cola");
        perroSinSalsasConCocaCola.setSalsas("Sin salsas");
        
        System.out.println(perroAmericano);
        System.out.println(perroSinCebolla);
        System.out.println(perroSinSalsasConCocaCola);
    }
    
}