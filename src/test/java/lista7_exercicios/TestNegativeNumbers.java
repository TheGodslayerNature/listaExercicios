package lista7_exercicios;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class TestNegativeNumbers {
    @Test
    public void testNegative(){
        int[] numbers = {1,-2,4,-9,0};
        int[] expected = {-2,-9};

        assertArrayEquals(expected, getNegatives(numbers));
    }

    public int[] getNegatives(int[] numbers) {
        return Arrays.stream(numbers).filter((i) -> i < 0).toArray();
    }
}
