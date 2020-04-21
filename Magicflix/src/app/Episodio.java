package app;


public class Episodio {

    public int numero;
    public String nombre;
    public String descripcion;
    public double duracion;
    public void reproducir(){
        System.out.println("Reproduciendo episodio" + this.numero + "" + this.nombre);
        
    }
}