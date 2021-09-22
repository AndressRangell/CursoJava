package visitor;

public class Lavadora implements IElectrodomestico, IVisitable {

    @Override
    public float getPrecio() {
        return 200f;
    }

    @Override
    public float aplicarDescuento(IVisitor visitor) {
        return visitor.visit(this);
    }
    
}
