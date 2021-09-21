package decorator;

public class PizzaHawaiana implements IPizza{

    @Override
    public String description() {
        return "Pizza Hawaiana";
    }

    @Override
    public float precio() {
        return 5000;
    }
    
}
