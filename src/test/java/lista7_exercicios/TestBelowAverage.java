package lista7_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TestBelowAverage {
    @Test
    public void testAverage(){
        double[] numbers = {10.00,15.5,13.2,9.0};
        assertEquals(12.125, BelowAverageProgram.getAverage(numbers),0.5);
    }
    @Test
    public void testBelowAverage(){
        double[] numbers = {10.00,15.5,13.2,9.0};
        double[] expected = {10.00,9.0};

        double[] belowAverage = BelowAverageProgram.getBelowAverage(numbers);

        assertEquals(expected.length, belowAverage.length);

        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], belowAverage[i],0.5);
        }
    }
}
