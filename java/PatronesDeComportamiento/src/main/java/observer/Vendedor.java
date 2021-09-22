package observer;

public class Vendedor implements IObserver{

    @Override
    public void notificacion(String mensaje) {
        System.out.println(mensaje);
    }
    
}
