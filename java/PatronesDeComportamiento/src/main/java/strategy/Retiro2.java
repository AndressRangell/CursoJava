package strategy;

public class Retiro2 implements IEstrategia{

    @Override
    public float realizarOperacion(float balance, float cantidad) {
        return balance - cantidad;
    }
    
}
