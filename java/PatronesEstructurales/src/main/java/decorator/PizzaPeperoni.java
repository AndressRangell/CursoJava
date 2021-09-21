package decorator;

public class PizzaPeperoni implements IPizza{

    @Override
    public String description() {
        return "Pizza Peperoni";
    }

    @Override
    public float precio() {
        return 7000;
    }
    
}
