package app;

public class Websodio extends Episodio {

    public String url;

   @Override
   public void reproducir() {

    System.out.println("Reproduciendo websodio "+ this.numero +"" + this.nombre + "url: "+ this.url);
    
}
public void enviarAlertaDeQueEstaOnline() {
   
    System.out.println("Enviando mail con url " + this.url);
}
   

} 