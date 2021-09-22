package state;

public class AutoEncender implements IEstadoAuto{
    
    private final Auto auto;
    
    public AutoEncender(Auto auto){
        this.auto = auto;
    }
    
    @Override
    public void encender() {
        System.out.println("El auto ya está encendido");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando el auto");
        auto.setEstadoActual(auto.getAutoAcelerando());
    }

    @Override
    public void apagar() {
        System.out.println("Apagando el auto");
        auto.setEstadoActual(auto.getAutoApagado());
    }
    
}
