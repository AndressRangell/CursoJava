package facade;

public class Computador {
    
    private final ITeclado teclado;
    private final IMouse mouse;
    
    public Computador(ITeclado teclado, IMouse mouse){
        this.teclado = teclado;
        this.mouse = mouse;
    }
    
    public void encender(){
        this.teclado.conectar();
        this.mouse.conectar();
    }
    
    public void configurar(){
        this.teclado.configurar();
        this.mouse.configurar();
    }
    
}
