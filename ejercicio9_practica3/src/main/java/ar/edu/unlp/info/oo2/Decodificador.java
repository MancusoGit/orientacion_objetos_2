package ar.edu.unlp.info.oo2;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {

    private List<Pelicula> catalogo;
    private List<Pelicula> peliculasVistas;
    private EstrategiaSugerencia estrategia;

    public Decodificador(List<Pelicula> catalogo, EstrategiaSugerencia estrategia) {
        this.catalogo = catalogo;
        this.peliculasVistas = new ArrayList<>();
        this.estrategia = estrategia;
    }

    public void agregarPeliculaCatalogo(Pelicula pelicula) {
        this.catalogo.add(pelicula);
    }

    public void agregarPeliculaVista(Pelicula pelicula) {
        this.peliculasVistas.add(pelicula);
    }

    public void setEstrategia(EstrategiaSugerencia nuevaEstrategia) {
        this.estrategia = nuevaEstrategia;
    }

    public List<Pelicula> getCatalogo() {
        return this.catalogo;
    }

    public List<Pelicula> getPeliculasVistas() {
        return this.peliculasVistas;
    }

    public List<Pelicula> obtenerSugerencias() {
        return this.estrategia.buscarSugerencias(this);
    }

}
