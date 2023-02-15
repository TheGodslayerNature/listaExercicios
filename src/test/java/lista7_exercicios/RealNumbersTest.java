package lista7_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RealNumbersTest {
    @Test
    public void testNumber(){
        double[] numbers = {2,8,777,666};
        assertEquals(2, RealNumbersProgram.greatestValueIndice(numbers));
    }
}
