package lista5_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RetanguloTest {
    @Test
    public void testAreaRetangulo(){
        Retangulo retangulo = new Retangulo();
        retangulo.setHeight(5);
        retangulo.setWidth(12);
        assertEquals(60, retangulo.area(),0.05);
    }
    @Test
    public void testPerimetroRetangulo(){
        Retangulo retangulo = new Retangulo();
        retangulo.setHeight(11);
        retangulo.setWidth(7);
        assertEquals(36, retangulo.perimeter(),0.05);
    }
    @Test
    public void testDiagonal(){
        Retangulo retangulo = new Retangulo();
        retangulo.setHeight(12);
        retangulo.setWidth(35);
        assertEquals(37, retangulo.diagonal(),0.05);
    }
}
