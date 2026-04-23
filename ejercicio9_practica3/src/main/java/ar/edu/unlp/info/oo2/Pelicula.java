package ar.edu.unlp.info.oo2;

import java.util.List;

public class Pelicula {

    private String titulo;
    private int añoEstreno;
    private double puntaje;
    private List<Pelicula> peliculasSimilares;

    public Pelicula(String titulo, int añoEstreno, double puntaje, List<Pelicula> similares) {
        this.titulo = titulo;
        this.añoEstreno = añoEstreno;
        this.puntaje = puntaje;
        this.peliculasSimilares = similares;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getAñoEstreno() {
        return this.añoEstreno;
    }

    public double getPuntaje() {
        return this.puntaje;
    }

    public List<Pelicula> getPeliculasSimilares() {
        return this.peliculasSimilares;
    }
    
}
