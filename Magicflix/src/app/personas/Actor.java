package app.personas;

import java.util.List;

import app.INominable;

public class Actor extends Persona implements INominable {

    public boolean ganoPreviamente() {
        // base de datos
        return true;
    }

    public void reproducirTrailerNominacion() {
        System.out.println("Reproduciendo trailer de pelicula de "+ this.getNombre());
    }

    public void sacarSelfie(List<Actor> elenco) {
        // autogenerated
    }

    public boolean estaNominada() {
       
        return false;
    }
    
    public void decirDiscurso(){
        System.out.println("Quiero agradecer a mi mami que siempre estuvo ahi");
    }


    
}