package ar.edu.unlp.info.oo2;

public class Calcio extends Atomo {
    
    public Calcio() {
        this.nombre = "Calcio";
        this.simbolo = "Ca";
        this.pesoAtomico = 40;
        this.carga = 2;
    }

    @Override
    public boolean soyMetal() {
        return true;
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
