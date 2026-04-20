package ar.edu.unlp.info.oo2;

public class ClasicoBuilder implements SandwichBuilder {

    private Sandwich sandwich;

    public ClasicoBuilder() { this.reset(); }

    @Override
    public void reset() { this.sandwich = new Sandwich(); }

    @Override
    public void buildPan() { sandwich.agregarIngrediente(new Ingrediente("Pan brioche", 100)); }

    @Override
    public void buildAderezo() { sandwich.agregarIngrediente(new Ingrediente("Mayonesa", 20)); }

    @Override
    public void buildPrincipal() { sandwich.agregarIngrediente(new Ingrediente("Carne de ternera", 300)); }

    @Override
    public void buildAdicional() { sandwich.agregarIngrediente(new Ingrediente("Tomate", 80)); }

    @Override
    public Sandwich getSandwich() { return this.sandwich; }
    
}
