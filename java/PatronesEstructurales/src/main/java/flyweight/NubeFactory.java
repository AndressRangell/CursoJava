package flyweight;

import java.util.HashMap;

public class NubeFactory {
    
    private final HashMap<TipoNube, Nube> mapaNubes;  
    
    public NubeFactory(){
        this.mapaNubes = new HashMap<>();
    }
    
    public Nube getNube(TipoNube tipo){
        Nube nube = this.mapaNubes.get(tipo);
        if(nube == null){
            nube = new Nube(tipo, "nube.png", 100, 100);
            this.mapaNubes.put(tipo, nube);
        }
        return nube;
    }
    
    public int getCantidadNubes(){
        return this.mapaNubes.size();
    }
    
}
