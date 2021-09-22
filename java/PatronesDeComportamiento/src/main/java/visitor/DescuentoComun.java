package visitor;

public class DescuentoComun implements IVisitor{

    @Override
    public float visit(IFruta fruta) {
        return fruta.getPrecio() * 0.10f;
    }

    @Override
    public float visit(IElectrodomestico electrodomestico) {
        return electrodomestico.getPrecio() * 0.05f;
    }
    
}
