package command;

public class Television implements IDevice{
    
    private boolean on;
    
    public Television(){
        this.on = false;
    }

    @Override
    public void on() {
        this.on = true;
        System.out.println("Televisión encendida");
    }

    @Override
    public void off() {
        this.on = false;
        System.out.println("Televisión apagada");
    }
    
}
