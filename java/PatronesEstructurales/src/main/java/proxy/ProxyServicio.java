package proxy;

public class ProxyServicio implements IServicio{

    private IServicio servicio;
    private Usuario usuario;
    
    public ProxyServicio(IServicio servicio, Usuario usuario){
        this.servicio = servicio;
        this.usuario = usuario;
    }

    @Override
    public void leer() {
        this.servicio.leer();
    }

    @Override
    public void escribir() {
        if(usuario.getNivelPermiso() >= 3) this.servicio.escribir();
        else System.out.println("No tienes permiso de escribir");
    }

    @Override
    public void actualizar() {
        if(usuario.getNivelPermiso() >= 3) this.servicio.actualizar();
        else System.out.println("No tienes permiso de actualizar");
    }

    @Override
    public void eliminar() {
        if(usuario.getNivelPermiso() >= 5) this.servicio.eliminar();
        else System.out.println("No tienes permiso de eliminar");
    }
    
}
