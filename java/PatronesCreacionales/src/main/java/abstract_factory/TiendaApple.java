package abstract_factory;

public class TiendaApple implements IFabrica{

    @Override
    public IComputador crearComputador() {
        return new MacbookPro();
    }

    @Override
    public ITablet crearTablet() {
        return new Ipad();
    }
    
}
