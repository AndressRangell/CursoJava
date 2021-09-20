package singleton;

public class Conexion {
    
    private static Conexion conexion;
    public String host;
    
    private Conexion(){
        
    }
    
    public synchronized static Conexion conectar(){
        
        if(conexion == null){
            conexion = new Conexion();
        }
        
        return conexion;
        
    }
    
}
