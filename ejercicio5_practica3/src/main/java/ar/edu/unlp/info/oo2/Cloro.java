package ar.edu.unlp.info.oo2;

public class Cloro extends Atomo {
    
    public Cloro() {
        this.nombre = "Cloro";
        this.simbolo = "Cl";
        this.pesoAtomico = 35;
        this.carga = -1;
    }

    @Override
    public boolean soyMetal() {
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
