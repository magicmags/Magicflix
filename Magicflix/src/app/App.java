package app;

import java.util.Scanner;

public class App {
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
    Magicflix miMagicflix = new Magicflix();
    
            System.out.println("Iniciando Catalogo");
    
            miMagicflix.inicializarCatalogo();
    
            Serie bb = miMagicflix.buscarSerie("Breaking Bad");
    
            Temporada laMejorTemporada = bb.getTemporada(5);
    
            Episodio elTop;
    
            elTop = laMejorTemporada.getEpisodio(7);
    
            elTop.reproducir();

            elTop = laMejorTemporada.getEpisodio(20);

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