package ar.edu.unlp.info.oo2;

import java.util.ArrayList;
import java.util.List;

public class TopografiaMixta extends Topografia {

    private final List<Topografia> hijos = new ArrayList<>();

    public TopografiaMixta(Topografia tp1, Topografia tp2, Topografia tp3, Topografia tp4) {
        this.hijos.add(tp1);
        this.hijos.add(tp2);
        this.hijos.add(tp3);
        this.hijos.add(tp4);
    }

    public List<Topografia> getHijos() {
        return this.hijos;
    }

    @Override
    public double proporcionAgua() {
        return this.hijos.stream()
        .mapToDouble(h -> h.proporcionAgua())
        .sum();
    }

    @Override
    public boolean esIgualA(Topografia otra) {
        // Le pasamos la pelota al otro objeto, diciéndole "Soy Mixta"
        return otra.esIgualAMixta(this); 
    }

    @Override
    protected boolean esIgualAAgua(TopografiaAgua agua) {
        return false; 
    }

    @Override
    protected boolean esIgualATierra(TopografiaTierra tierra) {
        return false;
    }

    @Override
    protected boolean esIgualAMixta(TopografiaMixta otraMixta) {
        return this.hijos.equals(otraMixta.getHijos());
    }

    @Override
    protected boolean esIgualAPantano(TopografiaPantano pantano) {
        return false;
    }

}
