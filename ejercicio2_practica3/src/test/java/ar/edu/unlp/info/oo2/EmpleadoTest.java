package ar.edu.unlp.info.oo2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class EmpleadoTest {

    private Empleado empleadoPlanta;
    private Empleado empleadoPasante;
    private Empleado empleadoTemporario;

    @BeforeEach
    void setUp() {
        empleadoPasante = new Pasante(2);
        empleadoPlanta = new Planta(2, 3, true);
        empleadoTemporario = new Temporario(8, 1,false);
    }

    @Test
    void testDescuento() {
        assertEquals(2800, empleadoPasante.descuento());
        assertEquals(7250, empleadoPlanta.descuento());
        assertEquals(3012, empleadoTemporario.descuento());
    }

    @Test
    void testSueldo() {
        assertEquals(21200, empleadoPasante.sueldo());
        assertEquals(57750, empleadoPlanta.sueldo());
        assertEquals(21388, empleadoTemporario.sueldo());
    }

}
