package factory_method;

public class Hamburguesa {
    
    private int precio;
    private String tipo;
    
    public Hamburguesa(int precio, String tipo){
        this.precio = precio;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Hamburguesa{" + "precio=" + precio + ", tipo=" + tipo + '}';
    }
    
}