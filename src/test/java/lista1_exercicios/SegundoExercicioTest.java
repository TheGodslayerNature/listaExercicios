package lista1_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class SegundoExercicioTest {
    @Test
    public void testRaioCirculo(){
        assertEquals("12.5664",SegundoExercicio.raio(2.00));
        assertEquals("31819.3103",SegundoExercicio.raio(100.64));
        assertEquals("70685.7750",SegundoExercicio.raio(150.00));
    }
}
