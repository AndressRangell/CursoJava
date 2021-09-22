package state;

public class Auto implements IEstadoAuto{

    private IEstadoAuto autoEncendido;
    private IEstadoAuto autoAcelerando;
    private IEstadoAuto autoApagado;
    
    IEstadoAuto estadoActual;
    
    public Auto(){
        this.autoEncendido = new AutoEncender(this);
        this.autoAcelerando = new AutoAcelerar(this);
        this.autoApagado = new AutoApagar(this);
        this.estadoActual = this.autoEncendido;
    }
    
    @Override
    public void encender() {
        this.estadoActual.encender();
    }

    @Override
    public void acelerar() {
        this.estadoActual.acelerar();
    }

    @Override
    public void apagar() {
        this.estadoActual.apagar();
    }

    public IEstadoAuto getAutoEncendido() {
        return autoEncendido;
    }

    public void setAutoEncendido(IEstadoAuto autoEncendido) {
        this.autoEncendido = autoEncendido;
    }

    public IEstadoAuto getAutoAcelerando() {
        return autoAcelerando;
    }

    public void setAutoAcelerando(IEstadoAuto autoAcelerando) {
        this.autoAcelerando = autoAcelerando;
    }

    public IEstadoAuto getAutoApagado() {
        return autoApagado;
    }

    public void setAutoApagado(IEstadoAuto autoApagado) {
        this.autoApagado = autoApagado;
    }

    public IEstadoAuto getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(IEstadoAuto estadoActual) {
        this.estadoActual = estadoActual;
    }
    
}
