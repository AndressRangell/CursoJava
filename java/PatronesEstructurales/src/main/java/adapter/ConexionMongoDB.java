package adapter;

public class ConexionMongoDB implements IConexionNoSQL{

    @Override
    public void conectar() {
        System.out.println("Conectando con MongoDB");
    }

    @Override
    public String executeSentence() {
        return "Ejecutando query con MongoDB";
    }
    
}
