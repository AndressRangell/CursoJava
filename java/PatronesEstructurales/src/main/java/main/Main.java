package main;

import adapter.AdapterDB;
import adapter.ConexionMongoDB;
import adapter.ConexionMySQL;
import adapter.IConexionSQL;
import composite.Menu;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        
        //Patrón Adapter
        //adapter();
        
        //Patrón Composite
        composite();
        
    }

    private static void adapter() {
        //Hacemos que dos clases que no pueden comunicarse, lo logren
        
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
    
}
