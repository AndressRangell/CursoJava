package simple_factory;

public class Pizzeria {
 
    public Pizza pequeña(String sabor){
        return new Pizza(sabor, 4);
    }
    
    public Pizza mediana(String sabor){
        return new Pizza(sabor, 8);
    }
    
    public Pizza grande(String sabor){
        return new Pizza(sabor, 12);
    }
    
}