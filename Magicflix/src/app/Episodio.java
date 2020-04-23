package app;


public class Episodio {

    public Episodio(int numero, String nombre, int duracion){
        this.numero = numero;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    private int numero;
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;

    }
    private String nombre;
    public String getNombre(){
        return this.nombre;

    }
    public void setNombre(String nombre) {
        this.nombre = nombre;


    }
    private String descripcion;
    public String getDescrpcion(){
        return this.descripcion;

    } 
     public void setDescripcion(String descripcion){
           
        this.descripcion = descripcion;
     }
    private double duracion;
    public double getDuracion(){
        return this.duracion;
    }
    public void setDuracion(double duracion){
        this.duracion = duracion;
    }
    public void reproducir(){
        System.out.println("Reproduciendo episodio" + this.numero + "" + this.nombre);
        
    }

}