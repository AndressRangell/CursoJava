package strategy;

public class Transaccion2 {
    
    private IEstrategia estrategia;
    
    public Transaccion2(IEstrategia estrategia){
        this.estrategia = estrategia;
    }
    
    public float ejecutarTransaccion(float balance, float cantidad){
        return this.estrategia.realizarOperacion(balance, cantidad);
    }
    
}
