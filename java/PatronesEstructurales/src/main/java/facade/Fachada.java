package facade;

public class Fachada {
    
    private Computador computador;
    
    public Fachada(){
        ITeclado teclado = new Teclado();
        IMouse mouse = new Mouse();
        this.computador = new Computador(teclado, mouse);
    }
    
    public void encender(){
        this.computador.encender();
        this.computador.configurar();
    }
    
}
