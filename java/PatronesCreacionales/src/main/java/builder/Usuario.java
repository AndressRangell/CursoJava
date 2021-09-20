package builder;

public class Usuario {

    private final String nombre;
    private final String apellido;
    private String direccion;
    private int telefono;
    private String email;

    private Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public static Usuario make(String nombre, String apellido) {
        return new Usuario(nombre, apellido);
    }
    
    public BuilderUsuario setContacto(boolean contacto){
        if(!contacto){
            throw new IllegalArgumentException("No es posible asignar un valor falso");
        }
        return new BuilderUsuario(this);
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", direccion="
                + direccion + ", telefono=" + telefono + ", email=" + email + '}';
    }

    public static class BuilderUsuario{

        private final Usuario usuario;

        public BuilderUsuario(Usuario usuario) {
            this.usuario = usuario;
        }

        public BuilderUsuario setDireccion(String direccion) {
            usuario.direccion = direccion;
            return this;
        }

        public BuilderUsuario setTelefono(int telefono) {
            usuario.telefono = telefono;
            return this;
        }

        public BuilderUsuario setEmail(String email) {
            usuario.email = email;
            return this;
        }
        
        public Usuario build(){
            return usuario;
        }

    }

}
