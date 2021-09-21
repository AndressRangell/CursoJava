package adapter;

public class AdapterDB implements IConexionSQL{
    
    IConexionNoSQL noSQL;
    
    public AdapterDB(IConexionNoSQL noSQL){
        this.noSQL = noSQL;
    }

    @Override
    public void conectar() {
        this.noSQL.conectar();
    }

    @Override
    public String runQuery() {
        return this.noSQL.executeSentence();
    }
    
}
