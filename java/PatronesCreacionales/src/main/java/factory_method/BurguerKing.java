package factory_method;

public class BurguerKing implements IHamburgueseria{

    @Override
    public Hamburguesa crearHamburguesa(String tipo) {
        
        switch (tipo) {
            case "Tradicional":
                return new Hamburguesa(5000, tipo);
            case "Ranchera":
                return new Hamburguesa(7000, tipo);
            case "Especial":
                return new HamburguesaEspecial(10000, tipo);
            default:
                return null;
        }
        
    }
    
}
