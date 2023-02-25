package lista7_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMaiorVetor {
    @Test
    public void testMaiorVetor(){
        double[] numbers = {8.0,4.0,10.0,14.0,13.0,7.0};
        assertEquals(14.0, RealNumbersProgram.getGreatestValue(numbers),0.05);
        assertEquals(3, RealNumbersProgram.greatestValueIndice(numbers));
    }
}
