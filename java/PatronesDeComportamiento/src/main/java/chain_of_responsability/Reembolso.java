package chain_of_responsability;

public class Reembolso implements IManejador{
    
    private IManejador manejador;

    @Override
    public void setNextManejador(IManejador manejador) {
        this.manejador = manejador;
    }

    @Override
    public void ejecutarTransaccion(Transaccion transaccion) {
        if(transaccion.getTipoTransaccion() == TipoTransaccion.REEMBOLSO){
            float cantidad = transaccion.getBalance() + transaccion.getCantidad();
            System.out.println("Saldo despues del reembolso es: " + cantidad);
        }else{
            System.out.println("Transaccion Rechazada");
        }
    }
    
}
