public class Book {

    String nombre;
    int paginas;

    public Book(String nombre, int paginas) {
        this.nombre = nombre;
        this.paginas = paginas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nombre='" + nombre + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
