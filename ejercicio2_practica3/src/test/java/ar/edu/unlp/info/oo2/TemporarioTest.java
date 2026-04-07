package ar.edu.unlp.info.oo2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TemporarioTest {

    private Temporario temporarioConChiche;
    private Temporario temporarioSinNada;

    @BeforeEach
    void setUp() {
        temporarioConChiche = new Temporario(8, 2, true);
        temporarioSinNada = new Temporario(3, 0, false);
    }

    @Test
    void testBasico() {
        assertEquals(22400, temporarioConChiche.basico());
        assertEquals(20900, temporarioSinNada.basico());
    }

    @Test
    void testAdicional() {
        assertEquals(9000, temporarioConChiche.adicional());
        assertEquals(0, temporarioSinNada.adicional());
    }

}
