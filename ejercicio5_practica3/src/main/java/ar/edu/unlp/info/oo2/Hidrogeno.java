package ar.edu.unlp.info.oo2;

public class Hidrogeno extends Atomo {

    public Hidrogeno() {
        this.nombre = "Hidrogeno";
        this.simbolo = "H";
        this.pesoAtomico = 1;
        this.carga = 1;
    }

    @Override
    protected boolean soyMetal() {
        return false;
    }

    @Override
    public String formula() {
        return this.simbolo;
    }

    @Override
    public double pesoMolecular() {
        return this.pesoAtomico;
    }

    @Override
    public double carga() {
        return this.carga;
    }

    @Override
    public boolean esValida() {
        return true;
    }

}
