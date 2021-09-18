package abstract_factory;

public class TiendaSamsung implements IFabrica{

    @Override
    public IComputador crearComputador() {
        return new NotebookPro();
    }

    @Override
    public ITablet crearTablet() {
        return new GalaxyA7();
    }
    
}
