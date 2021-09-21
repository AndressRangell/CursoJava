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

public class Main {

    public static void main(String[] args) {
        
        //Patrón Chain of Responsability
        //chainOfResponsability();
        
        //Patrón Command
        //command();
        
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
    
    private static void command(){
        //con este patrón desacoplamos los métodos de una clase para que sean
        //ejecutadas por un objeto que se encargue especificamente de eso
        //podemos testear mejor nuestra app y saber si un método específico falló
        
        IDevice tv = new Television();
        
        ICommand on = new OnDevice(tv);
        ICommand off = new OffDevice(tv);
        
        on.operacion();
        off.operacion();
    }
    
}
