package template_method;

public abstract class Usuario2 {

    public void autenticarse(){
        System.out.println("Todos los usuarios deben autenticarse");
    }
    
    public abstract void trabajar();
    
}
