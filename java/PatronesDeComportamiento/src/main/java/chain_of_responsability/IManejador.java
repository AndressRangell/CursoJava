package chain_of_responsability;

public interface IManejador {
    
    void setNextManejador(IManejador manejador);
    
    void ejecutarTransaccion(Transaccion transaccion);
    
}
