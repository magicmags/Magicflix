package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    
    public List<Episodio> episodios = new ArrayList<>();
    public int numero;

       @param nro
       @return
    
   public Episodio getEpisodio(int nro) {
       // Recorrer cada episodio
       // Si el nro de episodio del ciclo es igual a "nro"
       // Devolver esa episodio

       for (Episodio epi : this.episodios) {
           if (epi.numero == nro) {
               return epi;
           }

       }

       return null;
   }

   
     
     @param pos
     @return
    
   public Episodio getEpisodioAtPosicion(int pos) {
       return this.episodios.get(pos);
   }

   public List<Websodio> obtenerWebsodios() {
       List<Websodio> lista = new ArrayList<>();
       for (Episodio epi : this.episodios) {
           if (epi instanceof Websodio)
               lista.add((Websodio)epi);
       }
       return lista;
   }
}