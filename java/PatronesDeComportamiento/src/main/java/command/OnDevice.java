package command;

public class OnDevice implements ICommand{
    
    private final IDevice device;
    
    public OnDevice(IDevice device){
        this.device = device;
    }

    @Override
    public void operacion() {
        this.device.on();
    }
    
}
