package matrix;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestMatrix {
    @Test
    public void testMatrixLength(){
        int[][] matrixLength = new int[4][3];
        int[][] matrix = {{10, 8, 15, 12 }, {21, 11, 23, 8 }, {14, 5, 13, 19 }};
        assertEquals(matrixLength.length, Matrix.multiMatrix(4,3).length);
    }
    @Test
    public void testMatrixElements(){
        int[][] expectedMatrix = { {1, 2},{1, 2 } };
        int[][] matrix = Matrix.multiMatrix(2,2);

        int value = 0;
        for (int i = 0; i < expectedMatrix.length; i++) {
            for (int j = 0; j < expectedMatrix[i].length; j++) {
                matrix[i][j] = ++value;
            }
        }

        assertEquals(expectedMatrix.length, matrix.length);

        for (int i = 0; i < expectedMatrix.length - 1; i++) {
            for (int j = 0; j < expectedMatrix[i].length; j++) {
                assertEquals(expectedMatrix[i][j], matrix[i][j]);
            }
        }
    }
    @Test
    public void testElement(){
        int[][] expected = { {1, 7}, {8, 2}};
        assertEquals("Position 0, 0", Matrix.checkPosition(expected,1));
        assertEquals("Position 1, 0", Matrix.checkPosition(expected,8));
        assertEquals("Position 0, 1", Matrix.checkPosition(expected,7));
        assertEquals("Position 1, 1", Matrix.checkPosition(expected,2));
    }

    @Test
    public void testLeft(){
        int[][] expected = {
                {1, 7, 12},
                {8, 2},
                {5, 4},
        };
        assertEquals("Left: 1", Matrix.checkLeft(expected, 7));
        assertEquals("Left: 8", Matrix.checkLeft(expected, 2));
        assertEquals("Left: 7", Matrix.checkLeft(expected, 12));
    }
}
