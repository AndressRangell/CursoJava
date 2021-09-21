package chain_of_responsability;

public class Deposito implements IManejador{
    
    private IManejador manejador;

    @Override
    public void setNextManejador(IManejador manejador) {
        this.manejador = manejador;
    }

    @Override
    public void ejecutarTransaccion(Transaccion transaccion) {
        if(transaccion.getTipoTransaccion() == TipoTransaccion.DEPOSITO){
            float cantidad = transaccion.getBalance() + transaccion.getCantidad();
            System.out.println("Saldo despues del depósito es: " + cantidad);
        }else{
            this.manejador.ejecutarTransaccion(transaccion);
        }
    }
    
}
