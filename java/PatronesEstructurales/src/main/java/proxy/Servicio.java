package proxy;

public class Servicio implements IServicio{

    @Override
    public void leer() {
        System.out.println("Leyendo archivo");
    }

    @Override
    public void escribir() {
        System.out.println("Escribiendo archivo");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizando archivo");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando archivo");
    }
    
}
