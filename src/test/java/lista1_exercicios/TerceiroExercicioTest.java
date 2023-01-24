package lista1_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TerceiroExercicioTest {
    @Test
    public void testDiferencaProduto(){
        assertEquals(-26, TerceiroExercicio.diferenca(5,6,7,8));
        assertEquals(86, TerceiroExercicio.diferenca(5,6,-7,8));
    }
}
