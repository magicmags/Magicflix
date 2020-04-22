package app;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {

    public List<Temporada> temporada = new ArrayList<>();
    
   public Temporada getTemporada(int nro){
    for (Temporada tempo : this.temporada) {
        if (tempo.numero == nro) {
            return tempo;
        }

    }
    
     return null
   }

}