package chain_of_responsability;

public class Transaccion {
    
    private float balance;
    private float cantidad;
    private TipoTransaccion tipoTransaccion;
    
    public Transaccion(float balance, float cantidad, TipoTransaccion tipoTransaccion) {
        this.balance = balance;
        this.cantidad = cantidad;
        this.tipoTransaccion = tipoTransaccion;
    }
    
    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public TipoTransaccion getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

}
