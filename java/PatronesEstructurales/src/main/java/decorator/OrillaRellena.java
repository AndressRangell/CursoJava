package decorator;

public class OrillaRellena implements IPizza{

    IPizza pizza;
    
    public OrillaRellena(IPizza pizza){
        this.pizza = pizza;
    }
    
    @Override
    public String description() {
        return this.pizza.description() + " | Orilla rellena de queso";
    }

    @Override
    public float precio() {
        return this.pizza.precio() + 4000;
    }
    
}
