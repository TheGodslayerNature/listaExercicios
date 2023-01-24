package lista1_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuintoExercicioTest {
    @Test
    public void testPagarPorPecas(){
        assertEquals("VALOR A PAGAR: R$ 15.50",QuintoExercicio.pagarPecasTotal(1,5.30,2,5.10));
        assertEquals("VALOR A PAGAR: R$ 51.40",QuintoExercicio.pagarPecasTotal(2,15.30,4,5.20));
        assertEquals("VALOR A PAGAR: R$ 30.20",QuintoExercicio.pagarPecasTotal(1,15.10,1,15.10));
    }
}
