package state;

public class AutoAcelerar implements IEstadoAuto{
    
    private final Auto auto;
    
    public AutoAcelerar(Auto auto){
        this.auto = auto;
    }
    
    @Override
    public void encender() {
        System.out.println("El auto ya está encendido");
    }

    @Override
    public void acelerar() {
        System.out.println("El auto ya está acelerando");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando auto");
        auto.setEstadoActual(auto.getAutoApagado());
    }
    
}
