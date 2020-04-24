package app;

public class Pelicula extends Contenido {

    private Director director;

    public Director getDirector() {
        return this.director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    private int duracionEnMinutos;

    public int getDuracionEnMinutos() {
        return this.duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public Pelicula(Director director, int duracionEnMinutos) {
        this.director = director;
        this.duracionEnMinutos = duracionEnMinutos;

    }
}