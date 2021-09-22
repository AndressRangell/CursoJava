package state;

public class AutoApagar implements IEstadoAuto{
    
    private final Auto auto;
    
    public AutoApagar(Auto auto){
        this.auto = auto;
    }
    
    @Override
    public void encender() {
        System.out.println("Encendiendo el auto");
        auto.setEstadoActual(auto.getAutoEncendido());
    }

    @Override
    public void acelerar() {
        System.out.println("No se puede acelerar estando apagado");
    }

    @Override
    public void apagar() {
        System.out.println("El auto ya está apagado");
    }
    
}
