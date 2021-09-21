package facade;

public class Teclado implements ITeclado{

    @Override
    public void conectar() {
        System.out.println("Teclado conectado");
    }

    @Override
    public void configurar() {
        System.out.println("Teclado configurado con exito");
    }
    
}
