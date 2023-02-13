package lista7_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestVectorSum {
    @Test
    public void testVector(){
        double[] numbers = {2,2,2};
        assertEquals(6, VectorSum.getSum(numbers),0.05);
    }
    @Test
    public void testAverage(){
        double[] numbers = {2,2,2};
        assertEquals(2, VectorSum.getAverage(numbers),0.05);
    }
}
