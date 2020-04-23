package app;

public class Websodio extends Episodio {

    public Websodio(int numero, String nombre, int duracion, String url){
        
        super(numero,nombre,duracion);

        this.url = url;
    }

    public String url;

   @Override
   public void reproducir() {

    System.out.println("Reproduciendo websodio "+ this.getNumero() +"" + this.getNombre() + "url: "+ this.url);
    
}
public void enviarAlertaDeQueEstaOnline() {
   
    System.out.println("Enviando mail con url " + this.url);
}
   

} 