package lista2_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanoCartesianoTest {
    @Test
    public void testPlanoCartesiano(){
        assertEquals("Q4", PlanoCartesiano.coordenadas(4.5,-2.2));
        assertEquals("Q1", PlanoCartesiano.coordenadas(0.1,0.1));
        assertEquals("Origem", PlanoCartesiano.coordenadas(0.0,0.0));

        assertEquals("Q1", PlanoCartesiano.coordenadas(3.1,0.1));
        assertEquals("Q2", PlanoCartesiano.coordenadas(-3.5, 15.3));
        assertEquals("Q3", PlanoCartesiano.coordenadas(-3.5, -6.9));
        assertEquals("Q4", PlanoCartesiano.coordenadas(4.5,-1.2));
    }
}
