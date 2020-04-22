package app;

import java.util.Scanner;

public class App {
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
    Magicflix miMagicflix = new Magicflix();
    
            System.out.println("Iniciando Catalogo");
    
            miMagicflix.inicializarCatalogo();
    
            Serie community = miMagicflix.buscarSerie("Community");
    
            Temporada laMejorTemporada = community.getTemporada(1);
    
            Episodio elTop;
    
            elTop = laMejorTemporada.getEpisodio(1);
    
            elTop.reproducir();

            elTop = laMejorTemporada.getEpisodio(2);

            elTop.reproducir();
    
        System.out.println("Reproduciendo otra cosa");

        Episodio epiDemo;

        int posicion = 0;

        System.out.println("Ingrese la posicion");

        posicion = Teclado.nextInt();

        epiDemo = laMejorTemporada.getEpisodioAtPosicion(posicion);

        epiDemo.reproducir();
        if (epiDemo instanceof Websodio) {
            Websodio webi = (Websodio)epiDemo;
            webi.enviarAlertaDeQueEstaOnline();

        }
        else {
            System.out.println("No hay que hacer mas nada con un Episodio");
        }




        int lala;

        lala = 0;

    }
}