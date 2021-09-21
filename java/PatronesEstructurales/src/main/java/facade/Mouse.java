package facade;

public class Mouse implements IMouse{

    @Override
    public void conectar() {
        System.out.println("Mouse conectado");
    }

    @Override
    public void configurar() {
        System.out.println("Mouse configurado con exito");
    }
    
}
