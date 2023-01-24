package lista1_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuartoExercicioTest {
    @Test
    public void funcionarioDados(){
        String funcionario1 = "NUMBER = 25\nSALARY = U$ 550.00";
        assertEquals(funcionario1, QuartoExercicio.funcionarioDado(25, 100, 5.50));

        String funcionario2 = "NUMBER = 1\nSALARY = U$ 4100.00";
        assertEquals(funcionario2, QuartoExercicio.funcionarioDado(1, 200, 20.50));

        String funcionario3 = "NUMBER = 6\nSALARY = U$ 2254.75";
        assertEquals(funcionario3, QuartoExercicio.funcionarioDado(6, 145, 15.55));
    }
}
