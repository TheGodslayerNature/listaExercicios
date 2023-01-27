package lista2_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ImpostoTest {
     private final static double DELTA = 0.005;
    @Test
    public void testIsento(){
        assertEquals(0, Imposto.impostoDeRenda(1500.00),DELTA);
    }
    @Test
    public void testImpostoFaixa1(){
        assertEquals(8.00, Imposto.impostoDeRenda(2100.00),DELTA);
        assertEquals(16.00, Imposto.impostoDeRenda(2200.00),DELTA);
    }
    @Test
    public void testImpostoFaixa2(){
        assertEquals(80.36, Imposto.impostoDeRenda(3002.00),DELTA);
        assertEquals(80.18, Imposto.impostoDeRenda(3001.00),DELTA);
    }
    @Test
    public void testImpostoFaixa3(){
        assertEquals(355.60, Imposto.impostoDeRenda(4520.00),DELTA);
    }
}
