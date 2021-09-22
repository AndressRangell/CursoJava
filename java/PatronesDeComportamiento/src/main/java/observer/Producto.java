package observer;

import java.util.LinkedHashSet;
import java.util.Set;

public class Producto implements IObservable{

    private Set<IObserver> observadores;
    private int stock;

    public Producto(int stock) {
        this.stock = stock;
        this.observadores = new LinkedHashSet<>();
    }
    
    public void venta(){
        this.setStock(this.stock - 1);
        this.notificar();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void addObserver(IObserver observer) {
        observadores.add(observer);
    }

    @Override
    public void notificar() {
        for(IObserver observer: this.observadores){
            observer.notificacion("El producto se vendió!!");
        }
    }
    
}
