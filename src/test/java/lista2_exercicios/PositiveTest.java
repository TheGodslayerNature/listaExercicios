package lista2_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PositiveTest {
    @Test
    public void testInteiro(){
        assertTrue(Positive.isPositive(1));
        assertFalse(Positive.isPositive(-5));
    }
}
