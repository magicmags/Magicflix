package app;


public class Episodio {

    public Episodio(int numero, String nombre, int duracion){
        this.numero = numero;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public int numero;
    public String nombre;
    public String descripcion;
    public double duracion;
    public void reproducir(){
        System.out.println("Reproduciendo episodio" + this.numero + "" + this.nombre);
        
    }

}