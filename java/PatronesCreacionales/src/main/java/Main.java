
import simple_factory.Pizza;
import simple_factory.Pizzeria;

public class Main {

    public static void main(String[] args) {
        
        //Patron Simple Factory
        simpleFactory();
        
    }
    
    public static void simpleFactory(){
        //Este patrón creacional ayuda a crear objetos de manera controlada
        Pizzeria pizzeria = new Pizzeria();
        Pizza pizza1 = pizzeria.pequeña("champiñones");
        System.out.println(pizza1);
        
        Pizza pizza2 = pizzeria.mediana("hawuaiana");
        System.out.println(pizza2);
        
        Pizza pizza3 = pizzeria.grande("Pollo y queso");
        System.out.println(pizza3);
    }
    
}