package ar.edu.unlp.info.oo2;

public class VegetarianoBuilder implements SandwichBuilder {

    private Sandwich sandwich;

    public VegetarianoBuilder() { this.reset(); }

    @Override
    public void reset() { this.sandwich = new Sandwich(); }

    @Override
    public void buildPan() { sandwich.agregarIngrediente(new Ingrediente("Pan con semillas", 120)); }

    @Override
    public void buildAderezo() {}

    @Override
    public void buildPrincipal() { sandwich.agregarIngrediente(new Ingrediente("Provoleta grillada", 200)); }

    @Override
    public void buildAdicional() { sandwich.agregarIngrediente(new Ingrediente("Berenjenas al escabeche", 100)); }

    @Override
    public Sandwich getSandwich() { return this.sandwich; }

}
