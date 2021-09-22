package strategy;

public class Deposito2 implements IEstrategia{

    @Override
    public float realizarOperacion(float balance, float cantidad) {
        return balance + cantidad;
    }
    
}
