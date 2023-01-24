package lista1_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SextoExercicioTest {
    @Test
    public void testArea(){
        String resultado1 =
                "TRIANGULO: 7.800\nCIRCULO: 84.949\nTRAPEZIO: 18.200\nQUADRADO: 16.000\nRETANGULO: 12.000";
        assertEquals(resultado1, SextoExercicio.area(3.0,4.0,5.2));

        String resultado2 = "TRIANGULO: 96.520\nCIRCULO: 725.833\nTRAPEZIO: 175.560\nQUADRADO: 108.160\nRETANGULO: 132.080";
        assertEquals(resultado2, SextoExercicio.area(12.7,10.4,15.2));
    }
}
