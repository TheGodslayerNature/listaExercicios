package lista7_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PairTest {
    @Test
    public void testPair(){
        int[] pairs = {0,2,4,6};
        int[] numbers = {0,2,4,6,7,9};
        for (int i = 0; i < pairs.length; i++) {
            assertEquals(pairs[i],PairProgram.takePairs(numbers)[i]);
        }
    }
}
