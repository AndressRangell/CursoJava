package iterator;

public class IteradorGuia implements IIterador{
    
    private GuiaTelefonica guia;
    private int posicion;
    
    public IteradorGuia(GuiaTelefonica guia){
        this.guia = guia;
    }

    @Override
    public String siguiente() {
        return this.guia.getNumeros().get(posicion++);
    }

    @Override
    public boolean contieneSiguiente() {
        return this.posicion < this.guia.getNumeros().size() &&
                this.guia.getNumeros().get(posicion) != null;
    }
    
}
