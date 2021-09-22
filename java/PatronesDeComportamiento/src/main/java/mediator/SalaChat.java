package mediator;

import java.util.HashMap;

public class SalaChat {

    private final HashMap<String, Usuario> usuarios;
    
    public SalaChat(){
        this.usuarios = new HashMap<>();
    }
    
    public void añadirUsuario(Usuario usuario){
        this.usuarios.put(usuario.getNombre(), usuario);
    }
    
    public void enviarMensaje(Usuario remitente, Usuario receptor, String mensaje){
        if (this.usuarios.get(remitente.getNombre()) != null &&
                this.usuarios.get(receptor.getNombre()) != null) {
            mensaje = remitente.getNombre() + ": " + mensaje;
            receptor.recibirMensaje(mensaje);
        }else if(this.usuarios.get(receptor.getNombre()) == null){
            System.out.println("El usuarios " + receptor.getNombre() + " no se encuentra disponible");
        }else{
            System.out.println("Error al enviar mensaje");
        }
    }
    
}
