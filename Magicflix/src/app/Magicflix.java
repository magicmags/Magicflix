package app;

import java.util.ArrayList;
import java.util.List;

import app.personas.Actor;

public class Magicflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();
    public List<INominable> nominados = new ArrayList<INominable>();
    
   

    public Serie buscarSerie(String titulo) {

        for (Serie s : this.series) {
            if (s.getNombre().equals(titulo))
                return s;
        }
        return null;
    }

    public void inicializarCatalogo() {
        this.inicializarCommunity();
        this.inicializarFriends();
        this.inicializarPelis();
    }

    public void inicializarCommunity() {
        Serie community = new Serie("Community", 2009);
        this.series.add(community);

        Actor actor1 = new Actor();
        actor1.setNombre("Donald Glover");
        community.getElenco().add(actor1);

        Clasificacion clasificacion = new Clasificacion();
        clasificacion.setDescripcion("Mayor 18");
        clasificacion.setEdadMinima(18);
        clasificacion.setTipo("M");

        community.setClasificacion(clasificacion);

        community.setCalificacion(9);

        Genero genero = new Genero();
        genero.setNombre("Sitcom");
        community.setGenero(genero);

        Temporada t1 = new Temporada();
        t1.setNumero(1);
        community.getTemporadas().add(t1);

        Episodio epi = new Episodio(1, "Community", 22);
        // epi.numero = 1;
        // epi.nombre = " Community";
        // epi.duracion = 22;
        t1.getEpisodios().add(epi);

        epi = new Episodio(2, "Spanish 101", 23);
        // epi.numero = 2;
        // epi.nombre = " Spanish 101";
        // epi.duracion = 23;
        t1.getEpisodios().add(epi);

        Temporada t2 = new Temporada();
        t2.setNumero(2);
        community.getTemporadas().add(t2);

        epi = new Episodio(1, "Anthropology 101", 21);
        // epi.numero = 1;
        // epi.nombre = "Anthropology 101";
        // epi.duracion = 21;
        t2.getEpisodios().add(epi);

        epi = new Episodio(2, "Acounting for Lawyers", 21);
        // epi.numero = 2;
        // epi.nombre = "Acounting for Lawyers";
        // epi.duracion = 21;
        t2.getEpisodios().add(epi);

        Websodio webi = new Websodio(20, "Episodio Web", 30, "https://direccion.com");
        // webi.numero = 20;
        // webi.nombre = "Episodio Web";
        // webi.duracion = 30;
        // webi.url = "https://direccion.com";
        t2.getEpisodios().add(webi);
    }

    public void inicializarFriends() {

        Serie friends = new Serie("Friends", 1998);
        this.series.add(friends);

        Actor actor2 = new Actor();
        actor2.setNombre("Mathew Perry");
        friends.getElenco().add(actor2);

        Clasificacion clasificacion = new Clasificacion();
        clasificacion.setDescripcion("Pegi 12");
        clasificacion.setEdadMinima(12);
        clasificacion.setTipo("M");

        friends.setClasificacion(clasificacion);

        friends.setCalificacion(9.5);

        Genero genero = new Genero();
        genero.setNombre("Sitcom");
        friends.setGenero(genero);

        Temporada t1 = new Temporada();
        t1.setNumero(1);
        friends.getTemporadas().add(t1);

        Episodio epi = new Episodio(1, "Estreno", 22);
        // epi.numero = 1;
        // epi.nombre = "Estreno";
        // epi.duracion = 22;
        t1.getEpisodios().add(epi);

        epi = new Episodio(3, "The one witha thumb", 22);
        // epi.numero = 3;
        // epi.nombre = "The one whith a thumb";
        // epi.duracion = 22;
        t1.getEpisodios().add(epi);

        Temporada t2 = new Temporada();
        t2.setNumero(2);
        friends.getTemporadas().add(t2);

        epi = new Episodio(1, "The one with Ross's New Girlfriend", 22);
        // epi.numero = 1;
        // epi.nombre = " The One with Ross's New Girlfriend ";
        // epi.duracion = 22;
        t2.getEpisodios().add(epi);

        epi = new Episodio(2, "The one with the Breast Milk", 22);
        // epi.numero = 2;
        // epi.nombre = "The One with the Breast Milk";
        // epi.duracion = 22;
        t2.getEpisodios().add(epi);
    }
    public void inicializarPelis(){
        Pelicula peli = new Pelicula("Pride & Prejudice",125);
        Actor actor = new Actor();
        actor.setNombre("Keira Knightley");

        peli.getElenco().add(actor);

        this.peliculas.add(peli);

        peli = new Pelicula("10 things I hate about you", 135);
        actor = new Actor();
        actor.setNombre("Julia Stiles");

        peli.getElenco().add(actor);

        this.peliculas.add(peli);

    }
    

    public void inicializarListaNominados() {

        for (Pelicula peli : this.peliculas) {
            this.nominados.add(peli);
            for (Actor actor : peli.getElenco())
                this.nominados.add(actor);

        }
        for (Serie serie : this.series) {
            for (Actor actor : serie.getElenco())
                this.nominados.add(actor);

        }
    }

    public void reproducirTrailersDeNominacion() {
        for (INominable nominado : nominados) {

            nominado.reproducirTrailerNominacion();
            if (nominado instanceof Actor) {
                Actor actor = (Actor) nominado;

                actor.decirDiscurso();

            }
        }
    }
    
    


}