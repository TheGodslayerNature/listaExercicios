package lista2_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntervalosTest {
    @Test
    public void testIntervalos(){
        assertEquals("(25,50]", Intervalos.qualIntervalo(25.01));
        assertEquals("[0,25]", Intervalos.qualIntervalo(25.00));
        assertEquals("(75,100]", Intervalos.qualIntervalo(100.00));
        assertEquals("Fora de intervalo", Intervalos.qualIntervalo(-25.02));
    }
    @Test
    public void testForaDoIntervalo(){
        assertEquals("Fora de intervalo", Intervalos.qualIntervalo(15.56));
    }
}
