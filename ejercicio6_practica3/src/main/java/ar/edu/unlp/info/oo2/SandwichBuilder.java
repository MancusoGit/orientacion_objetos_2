package ar.edu.unlp.info.oo2;

public interface SandwichBuilder {

    void reset();
    void buildPan();
    void buildAderezo();
    void buildPrincipal();
    void buildAdicional();
    Sandwich getSandwich();    

}
