package ar.edu.unlp.info.oo2;

public class SinTACCBuilder implements SandwichBuilder {
    private Sandwich sandwich;

    public SinTACCBuilder() { this.reset(); }

    @Override
    public void reset() { this.sandwich = new Sandwich(); }

    @Override
    public void buildPan() { sandwich.agregarIngrediente(new Ingrediente("Pan de chipa", 150)); }

    @Override
    public void buildAderezo() { sandwich.agregarIngrediente(new Ingrediente("Salsa tartara", 18)); }

    @Override
    public void buildPrincipal() { sandwich.agregarIngrediente(new Ingrediente("Carne de pollo", 250)); }

    @Override
    public void buildAdicional() { sandwich.agregarIngrediente(new Ingrediente("Verduras grilladas", 200)); }

    @Override
    public Sandwich getSandwich() { return this.sandwich; }
}
