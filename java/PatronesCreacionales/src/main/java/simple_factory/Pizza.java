package simple_factory;

public class Pizza {

    private final String sabor;
    private final int rebanadas;
    
    public Pizza(String sabor, int rebanadas){
        this.sabor = sabor;
        this.rebanadas = rebanadas;
    }

    @Override
    public String toString() {
        return "Pizza{" + "sabor=" + sabor + ", rebanadas=" + rebanadas + '}';
    }
    
}
