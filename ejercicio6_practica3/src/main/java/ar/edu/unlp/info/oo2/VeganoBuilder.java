package ar.edu.unlp.info.oo2;

public class VeganoBuilder implements SandwichBuilder {

    private Sandwich sandwich;

    public VeganoBuilder() { this.reset(); }

    @Override
    public void reset() { this.sandwich = new Sandwich(); }

    @Override
    public void buildPan() { sandwich.agregarIngrediente(new Ingrediente("Pan integral", 100)); }

    @Override
    public void buildAderezo() { sandwich.agregarIngrediente(new Ingrediente("Salsa criolla", 20));}

    @Override
    public void buildPrincipal() { sandwich.agregarIngrediente(new Ingrediente("Milanesa de girgolas", 500)); }

    @Override
    public void buildAdicional() {}

    @Override
    public Sandwich getSandwich() { return this.sandwich; }
}
