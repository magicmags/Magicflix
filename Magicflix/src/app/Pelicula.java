package app;

import java.util.List;

public class Pelicula extends Contenido implements INominable {

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

    public Pelicula(String nombre, int duracionEnMinutos) {
        this.setNombre(nombre);
        this.duracionEnMinutos = duracionEnMinutos;

    }

    public boolean ganoPreviamente() {
        // TODO Auto-generated method stub
        return false;
    }

    public void reproducirTrailerNominacion() {
        System.out.println("Reproduciendo trailer");

    }

    public void sacarSelfie(List<Actor> elenco) {
        // TODO Auto-generated method stub

    }

    
    public boolean estaNominada() {
        
        return false;
    }
}