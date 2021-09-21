package adapter;

public class ConexionMySQL implements IConexionSQL{

    @Override
    public void conectar() {
        System.out.println("Conectando con MySQL");
    }

    @Override
    public String runQuery() {
        return "Ejecutando Query con MySQL";
    }
    
}
