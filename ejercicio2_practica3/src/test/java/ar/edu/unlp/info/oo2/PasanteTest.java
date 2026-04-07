package ar.edu.unlp.info.oo2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class PasanteTest {

    private Pasante pasanteNoExamenes;
    private Pasante pasanteConExamenes;

    @BeforeEach
    void setUp() {
        pasanteNoExamenes = new Pasante(0);
        pasanteConExamenes = new Pasante(3);
    }

    @Test
    void testAdicional() {
        assertEquals(0, pasanteNoExamenes.adicional());
        assertEquals(6000, pasanteConExamenes.adicional());
    }

}
