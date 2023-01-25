package lista2_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MultiplosTest {
    @Test
    public void testMultiplo(){
        assertTrue(Multiplos.saoMultiplos(6,24));
        assertFalse(Multiplos.saoMultiplos(6,25));
        assertTrue(Multiplos.saoMultiplos(24,6));
    }
}
