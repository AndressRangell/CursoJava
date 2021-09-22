package visitor;

public class Manzana implements IFruta, IVisitable {

    @Override
    public float getPrecio() {
        return 2f;
    }

    @Override
    public float aplicarDescuento(IVisitor visitor) {
        return visitor.visit(this);
    }
    
}
