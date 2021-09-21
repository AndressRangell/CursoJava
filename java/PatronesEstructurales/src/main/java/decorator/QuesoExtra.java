package decorator;

public class QuesoExtra implements IPizza{

    IPizza pizza;
    
    public QuesoExtra(IPizza pizza){
        this.pizza = pizza;
    }
    
    @Override
    public String description() {
        return this.pizza.description() + " | queso extra";
    }

    @Override
    public float precio() {
        return this.pizza.precio() + 2000;
    }
    
}
