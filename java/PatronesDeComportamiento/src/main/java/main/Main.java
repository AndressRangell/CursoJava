package main;

import chain_of_responsability.Deposito;
import chain_of_responsability.IManejador;
import chain_of_responsability.Reembolso;
import chain_of_responsability.Retiro;
import chain_of_responsability.TipoTransaccion;
import chain_of_responsability.Transaccion;
import command.ICommand;
import command.IDevice;
import command.OffDevice;
import command.OnDevice;
import command.Television;
import iterator.GuiaTelefonica;
import iterator.IIterador;
import iterator.IteradorGuia;
import java.util.Iterator;
import mediator.SalaChat;
import mediator.Usuario;
import memento.Cliente;
import observer.Producto;
import observer.Vendedor;
import state.Auto;

public class Main {

    public static void main(String[] args) {

        //Patrón Chain of Responsability
        //chainOfResponsability();
        
        //Patrón Command
        //command();
        
        //Patrón Iterator
        //iterator();
        
        //Patrón Madiator
        //mediator();
        
        //Patrón Memento
        //memento();
        
        //Patrón Observer
        //observer();
        
        //Patrón State
        state();

    }

    private static void chainOfResponsability() {
        //En caso de no poder realizar la transacción le asigna la responsabilidad
        //a la transacción siguiente

        Transaccion transaccion = new Transaccion(500, 300, TipoTransaccion.DEPOSITO);

        IManejador deposito = new Deposito();
        IManejador retiro = new Retiro();
        IManejador reembolso = new Reembolso();

        deposito.setNextManejador(retiro);
        retiro.setNextManejador(reembolso);

        deposito.ejecutarTransaccion(transaccion);
    }

    private static void command() {
        //con este patrón desacoplamos los métodos de una clase para que sean
        //ejecutadas por un objeto que se encargue especificamente de eso
        //podemos testear mejor nuestra app y saber si un método específico falló

        IDevice tv = new Television();

        ICommand on = new OnDevice(tv);
        ICommand off = new OffDevice(tv);

        on.operacion();
        off.operacion();
    }

    private static void iterator() {
        //Permite iterar una colección de datos sin acceder a la clase que la contiene

        GuiaTelefonica guia = new GuiaTelefonica();

        guia.add("123");
        guia.add("124");
        guia.add("125");
        guia.add("126");
        guia.add("127");
        guia.add("128");

        IIterador iterador = new IteradorGuia(guia);
        //Iterator iterador = guia.getNumeros().iterator();

        while (iterador.contieneSiguiente()) {
            System.out.println(iterador.siguiente());
        }
    }

    private static void mediator() {
        //Sirve como un puente para comunicar dos objetos sin importar si
        //son iguales o no
        
        Usuario jhoan = new Usuario("Jhoan");
        Usuario wendy = new Usuario("Wendy");
        
        SalaChat sala = new SalaChat();
        
        sala.añadirUsuario(jhoan);
        sala.añadirUsuario(wendy);
        
        sala.enviarMensaje(jhoan, wendy, "Hola, Cómo vas??");
    }
    
    private static void memento(){
        //Crea una copia de seguridad de un objeto para recuperarlo cuando sea necesario
        
        Cliente jhoan = new Cliente("Jhoan", "Rangel", 20);
        Cliente memento = jhoan.getMemento();
        
        jhoan.setNombre("Manuel");
        jhoan.setEdad(19);
        System.out.println("Objeto cambiado");
        System.out.println(jhoan);
        
        jhoan.resetMemento(memento);
        System.out.println("Objeto restaurado con memento");
        System.out.println(jhoan);
    }
    
    private static void observer(){
        //Podemos notificar a los observadores interesados cuando un objeto cambie
        
        Producto aguacate = new Producto(4);
        
        Vendedor vendedor1 = new Vendedor();
        Vendedor vendedor2 = new Vendedor();
        Vendedor vendedor3 = new Vendedor();
        
        aguacate.addObserver(vendedor1);
        aguacate.addObserver(vendedor2);
        aguacate.addObserver(vendedor3);
        
        aguacate.venta();
    }
    
    private static void state(){
        //Este patrón permite cambiar la funcionalidad de los objetos dependiendo
        //del estado en el que se encuentra
        
        Auto auto = new Auto();
        
        auto.apagar();
        auto.acelerar();
        auto.encender();
        auto.acelerar();
        auto.acelerar();
        auto.apagar();
    }

}
