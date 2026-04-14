package ar.edu.unlp.info.oo2;

public class Oxigeno extends Atomo {

    public Oxigeno() {
        this.nombre = "Oxigeno";
        this.simbolo = "O";
        this.pesoAtomico = 16;
        this.carga = -2;
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
