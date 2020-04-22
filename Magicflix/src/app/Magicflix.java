package app;

import java.util.ArrayList;
import java.util.List;

public class Magicflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    public Serie buscarSerie(String titulo) {

        for (Serie s : this.series) {
            if (s.nombre.equals(titulo))
                return s;
        }
        return null;
    }

    public void inicializarCatalogo() {
        this.inicializarCommunity();
        this.inicializarFriends();
    }

    public void inicializarCommunity() {
        Serie community = new Serie();
        community.nombre = "Community";
        this.series.add(community);

        Actor actor1 = new Actor();
        actor1.nombre = "Donald Glover";
        community.elenco.add(actor1);

        Clasificacion clasificacion = new Clasificacion();
        clasificacion.descripcion = "Mayor 18";
        clasificacion.edadMinima = 18;
        clasificacion.tipo = "M";

        community.clasificacion = clasificacion;

        community.calificacion = 9;

        Genero genero = new Genero();
        genero.nombre = "Sitcom";
        community.genero = genero;

        Temporada t1 = new Temporada();
        t1.numero = 1; 
        community.temporadas.add(t1);

        Episodio epi = new Episodio();
        epi.numero = 1;
        epi.nombre = "Community";
        epi.duracion = 22;
        t1.episodios.add(epi);

        epi = new Episodio();
        epi.numero = 2;
        epi.nombre = "Spanish 101";
        epi.duracion = 23;
        t1.episodios.add(epi);

        Temporada t2 = new Temporada();
        t2.numero = 2;
        community.temporadas.add(t2);

        epi = new Episodio();
        epi.numero = 1;
        epi.nombre = "Anthropology 101";
        epi.duracion = 21;
        t2.episodios.add(epi);

        epi = new Episodio();
        epi.numero = 2;
        epi.nombre = "Acounting for Lawyers";
        epi.duracion = 21;
        t2.episodios.add(epi);

        Websodio webi = new Websodio();
        webi.numero = 20;
        webi.nombre = "Episodio Web";
        webi.duracion = 30;
        webi.url = "https://direccion.com";
        t2.episodios.add(webi);
    }
    public void inicializarFriends(){
    
        Serie friends = new Serie();
        friends.nombre = "Friends";
        this.series.add(friends);

        Actor actor2 = new Actor();
        actor2.nombre = "Mathew Perry";
        friends.elenco.add(actor2);

        Clasificacion clasificacion = new Clasificacion();
        clasificacion.descripcion = "Pegi 12";
        clasificacion.edadMinima = 12;
        clasificacion.tipo = "M";

        friends.clasificacion = clasificacion;

        friends.calificacion = 9.5;

        Genero genero = new Genero();
        genero.nombre = "Sitcom";
        friends.genero = genero;

        Temporada t1 = new Temporada();
        t1.numero = 1; 
        friends.temporadas.add(t1);

        Episodio epi = new Episodio();
        epi.numero = 1;
        epi.nombre = "Estreno";
        epi.duracion = 22;
        t1.episodios.add(epi);

        epi = new Episodio();
        epi.numero = 3;
        epi.nombre = "The one whith a thumb";
        epi.duracion = 22;
        t1.episodios.add(epi);

        Temporada t2 = new Temporada();
        t2.numero = 2;
        friends.temporadas.add(t2);

        epi = new Episodio();
        epi.numero = 1;
        epi.nombre = " The One with Ross's New Girlfriend ";
        epi.duracion = 22;
        t2.episodios.add(epi);

        epi = new Episodio();
        epi.numero = 2;
        epi.nombre = "The One with the Breast Milk";
        epi.duracion = 22;
        t2.episodios.add(epi);
    }

    
    


}