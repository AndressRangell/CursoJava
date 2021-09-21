package main;

import adapter.AdapterDB;
import adapter.ConexionMongoDB;
import adapter.ConexionMySQL;
import adapter.IConexionSQL;
import composite.Menu;
import decorator.IPizza;
import decorator.OrillaRellena;
import decorator.PizzaHawaiana;
import decorator.PizzaPeperoni;
import decorator.QuesoExtra;
import facade.Fachada;
import flyweight.Nube;
import flyweight.NubeFactory;
import flyweight.TipoNube;
import proxy.IServicio;
import proxy.ProxyServicio;
import proxy.Servicio;
import proxy.Usuario;

public class Main {

    public static void main(String[] args) {
        
        //Patrón Adapter
        //adapter();
        
        //Patrón Composite
        //composite();
        
        //Patrón Decorator
        //decorator();
        
        //Patrón Facade
        //facade();
        
        //Patrón Proxy
        //proxy();
        
        //Patrón FlyWeight
        flyweight();
        
    }

    private static void adapter() {
        //Creamos un adaptador para poder comunicar la clase NoSQL con la SQL
        
        //Creamos la conexión SQL
        IConexionSQL conexionMySQL = new ConexionMySQL();
        conexionMySQL.conectar();
        System.out.println(conexionMySQL.runQuery());
        
        //Creamos la conexión No SQL adaptando su interfaz con la conexión SQL
        IConexionSQL conexionMongo = new AdapterDB(new ConexionMongoDB());
        conexionMongo.conectar();
        System.out.println(conexionMongo.runQuery());
    }

    private static void composite() {
        //Podemos crear objetos dentro de otros objetos en forma de arbol o jerarquía
        
        Menu menu = new Menu();
        
        Menu menu2 = new Menu();
        Menu menu3 = new Menu();
        
        Menu menu4 = new Menu();
        Menu menu5 = new Menu();
        
        menu2.addMenu(menu4);
        menu2.addMenu(menu5);
        
        menu.addMenu(menu2);
        menu.addMenu(menu3);
        
        menu.open();
        menu.close();
        
        System.out.println("Referencia del menú 4 " + menu4);
        System.out.println("Referencia del menú 4 " + menu2.getMenu(0));
    }

    private static void decorator() {
        //añadimos nuevas funcionalidades a un mismo objeto
        
        IPizza pizzaPeperoni = new OrillaRellena(new QuesoExtra(new PizzaPeperoni()));
        
        //Pizza peperoni 7.000 + queso extra 2.000 + orilla rellena 4.000 = 13.000
        System.out.println(pizzaPeperoni.description());
        System.out.println(pizzaPeperoni.precio());
        
        IPizza pizzaHawaiana = new OrillaRellena(new PizzaHawaiana());
        
        //Pizza hawaiana 5.000 + orilla rellena 4.000 = 9.000
        System.out.println(pizzaHawaiana.description());
        System.out.println(pizzaHawaiana.precio());
    }
    
    private static void facade(){
        //Muestra al cliente una fachada con los métodos o funcionalidades necesarias
        //lo que no sea relevante para el cliente se ejecuta internamente
        
        Fachada fachadaComputador = new Fachada();
        fachadaComputador.encender();
    }
    
    private static void proxy(){
        //se encarga de limitar funcionalidad de nuestro sistema
        
        IServicio servicio = new ProxyServicio(new Servicio(), new Usuario(5));
        servicio.leer();
        servicio.escribir();
        servicio.actualizar();
        servicio.eliminar();
        
        //VirtualProxy es una variante de proxy, crea el objeto servicio una sola vez
        //no lo enviamos por constructor sino se crea dentro, se usa cuando sea necesario
    }
    
    private static void flyweight(){
        //Patrón para reutilizar objetos, si ya existe un objeto igual lo reutiliza
        //si no existe lo crea y lo agrega al mapa de objetos
        
        NubeFactory factory = new NubeFactory();
        
        for(int i = 0; i < 100; i++){
            Nube nubeChica = factory.getNube(TipoNube.CHICA);
            Nube nubeMediana = factory.getNube(TipoNube.MEDIANA);
            Nube nubeGrande = factory.getNube(TipoNube.GRANDE);
        }
        
        System.out.println("Cantidad de objetos: " + factory.getCantidadNubes());
    }
    
}
