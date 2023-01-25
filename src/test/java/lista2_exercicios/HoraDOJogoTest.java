package lista2_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HoraDOJogoTest {
    @Test
    public void testHoraDoJogo(){
        assertEquals(24, HoraDoJogo.duracao(0,0));
        assertEquals(10, HoraDoJogo.duracao(16,2));
        assertEquals(14, HoraDoJogo.duracao(2,16));
    }
}

