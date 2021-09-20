package prototype;

public class HotDog {
    
    private String salchicha;
    private String saborGaseosa;
    private String salsas;
    private boolean quesoSalado;
    private boolean cebolla;

    public HotDog(String salchicha, String saborGaseosa, String salsas, boolean quesoSalado, boolean cebolla) {
        this.salchicha = salchicha;
        this.saborGaseosa = saborGaseosa;
        this.salsas = salsas;
        this.quesoSalado = quesoSalado;
        this.cebolla = cebolla;
    }

    public HotDog(HotDog hotDog) {
        this.salchicha = hotDog.getSalchicha();
        this.saborGaseosa = hotDog.getSaborGaseosa();
        this.salsas = hotDog.getSalsas();
        this.quesoSalado = hotDog.getQuesoSalado();
        this.cebolla = hotDog.getCebolla();
    }

    public String getSalchicha() {
        return salchicha;
    }

    public void setSalchicha(String salchicha) {
        this.salchicha = salchicha;
    }

    public String getSaborGaseosa() {
        return saborGaseosa;
    }

    public void setSaborGaseosa(String saborGaseosa) {
        this.saborGaseosa = saborGaseosa;
    }

    public String getSalsas() {
        return salsas;
    }

    public void setSalsas(String salsas) {
        this.salsas = salsas;
    }

    public boolean getQuesoSalado() {
        return quesoSalado;
    }

    public void setQuesoSalado(boolean quesoSalado) {
        this.quesoSalado = quesoSalado;
    }

    public boolean getCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    @Override
    public String toString() {
        return "HotDog con salchicha " + salchicha + "\nGaseosa " + saborGaseosa + "\n" + salsas + "\nQueso Salado " + quesoSalado + "\nCebolla " + cebolla + "\n";
    }
    
}
