package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada {

    private List<Episodio> episodios = new ArrayList<>();

    public List<Episodio> getEpisodios() {
        return this.episodios;
    }

    public void setEpisodios(List<Episodio> episodios) {
        this.episodios = episodios;
    }

    private int numero;

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Episodio getEpisodio(int nro) {

        for (Episodio epi : this.episodios) {
            if (epi.getNumero() == nro) {
                return epi;

            }
        }

        return null;
    }

    public Episodio getEpisodioAtPosicion(int pos) {
        return this.episodios.get(pos);
    }

    public List<Websodio> obtenerWebsodios() {
        List<Websodio> lista = new ArrayList<>();
        for (Episodio epi : this.episodios) {
            if (epi instanceof Websodio)
                lista.add((Websodio) epi);
        }
        return lista;
    }
}