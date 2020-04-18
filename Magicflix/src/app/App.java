package app;

public class App {
    public static void main(String[] args) throws Exception {
    
        
    Magicflix miMagicflix = new Magicflix();
    
            System.out.println("Iniciando Catalogo");
    
            miMagicflix.inicializarCatalogo();
    
            Serie bb = miMagicflix.buscarSerie("Breaking Bad");
    
            Temporada laMejorTemporada = bb.getTemporada(5);
    
            Episodio elTop;
    
            elTop = laMejorTemporada.getEpisodio(7);
    
            elTop.reproducir();
    
        
    }
}