package ar.edu.unlp.info.oo2;

public abstract class Atomo {

    protected String nombre;
    protected String simbolo;
    protected double pesoAtomico;
    protected double carga;

    protected abstract boolean soyMetal();

    public abstract String formula();

    public abstract double pesoMolecular();

    public abstract double carga();

    public abstract boolean esValida();

    protected boolean combinacionValida(Atomo at) {
        return !(this.soyMetal() && at.soyMetal());
    }
}
