package app;

import java.util.ArrayList;
import java.util.List;

import app.personas.Actor;

public abstract class Contenido {

  private String nombre;

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  private Clasificacion clasificacion;

  public Clasificacion getClasificacion() {
    return this.clasificacion;
  }

  public void setClasificacion(Clasificacion clasificacion) {
    this.clasificacion = clasificacion;

  }

  private Genero genero;

  public Genero getGenero() {
    return this.genero;
  }

  public void setGenero(Genero genero) {
    this.genero = genero;

  }

  private int anio;

  public int getAnio() {
    return this.anio;
  }

  public void setAnio(int anio) {
    this.anio = anio;
  }

  private String descripcion;

  public String getDescripcion() {
    return this.descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  private List<Actor> elenco = new ArrayList<>();

  public List<Actor> getElenco() {
    return this.elenco;
  }

  public void setElenco(List<Actor> elenco) {
    this.elenco = elenco;
  }

  private double calificacion;

  public double getCalificacion() {
    return this.calificacion;
  }

  public void setCalificacion(double calificacion) {
    this.calificacion = calificacion;

  }

  public void reproducir() {

  }

}