package ar.edu.unlp.info.oo2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PlantaTest {

    private Planta plantaConChiche;
    private Planta plantaSinNada;


    @BeforeEach
    void setUp() {
        plantaConChiche = new Planta(3, 5, true);
        plantaSinNada = new Planta(0, 1, false);
    }

    @Test
    void testAdicional() {
        assertEquals(21000, plantaConChiche.adicional());
        assertEquals(2000, plantaSinNada.adicional());
    }

}
