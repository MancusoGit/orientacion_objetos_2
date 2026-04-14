package ar.edu.unlp.info.oo2;

import java.util.List;
import java.util.stream.Collectors;

public class Union extends Atomo {

    private final List<Atomo> elementos;

    public Union (List<Atomo> elementos) {
        this.elementos = elementos;
    }

    @Override
    public boolean soyMetal() {
        return false;
    }

    @Override
    public String formula() {
        return this.elementos.stream()
                .map(e -> e.formula())
                .collect(Collectors.joining());
    }

    @Override
    public double pesoMolecular() {
        return this.elementos.stream()
                .mapToDouble(e -> e.pesoMolecular())
                .sum();
    }

    @Override
    public double carga() {
        return this.elementos.stream()
                .mapToDouble(e -> e.carga())
                .sum();
    }

    @Override
    public boolean esValida() {
        long cantidadMetales = this.elementos.stream()
                                .filter(e -> e.soyMetal())
                                .count();
        return cantidadMetales <= 1;
    }

    public boolean soyEstable() {
        return this.carga() == 0;
    }

}
