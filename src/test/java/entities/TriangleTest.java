package entities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class TriangleTest {
    @Test
    public void testTriangle(){
        Triangle triangle = new Triangle(2.0,3.0,4.0);
        assertEquals(triangle, new Triangle(2.0,3.0,4.0));
    }
    @Test
    public void testTrianglemeasurements(){
        Triangle triangle = new Triangle(2.0,3.0,4.0);
        assertEquals(2.0, triangle.getA(), 0.001);
        assertEquals(3.0, triangle.getB(), 0.001);
        assertEquals(4.0, triangle.getC(), 0.001);
        triangle.setA(8.0);
        assertEquals(8.0, triangle.getA(), 0.001);
    }
    @Test
    public void testTraingleNotEquals(){
        Triangle xTriangle = new Triangle(2.0,3.0,4.0);
        Triangle yTriangle = new Triangle(2.0,3.0,4.0);
        assertNotSame(xTriangle, yTriangle);
    }
}
