package lista2_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParOuImparTest {
    @Test
    public void testParOuImpar(){
        assertTrue(ParOuImpar.isPar(2));
        assertFalse(ParOuImpar.isPar(7));
    }
}
