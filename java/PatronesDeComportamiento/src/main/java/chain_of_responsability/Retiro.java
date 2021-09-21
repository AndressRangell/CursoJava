package chain_of_responsability;

public class Retiro implements IManejador{
    
    private IManejador manejador;

    @Override
    public void setNextManejador(IManejador manejador) {
        this.manejador = manejador;
    }

    @Override
    public void ejecutarTransaccion(Transaccion transaccion) {
        if(transaccion.getTipoTransaccion() == TipoTransaccion.RETIRO){
            float cantidad = transaccion.getBalance() - transaccion.getCantidad();
            System.out.println("Saldo despues del retiro es: " + cantidad);
        }else{
            this.manejador.ejecutarTransaccion(transaccion);
        }
    }
    
}
