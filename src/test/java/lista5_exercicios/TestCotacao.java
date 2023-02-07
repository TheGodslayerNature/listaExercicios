package lista5_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCotacao {
    Dollar dollar = new Dollar();

    @Test
    public void testDollar(){
        dollar.setDollar(3.10);
        assertEquals(3.10, dollar.getDollar(),0.05);
    }
    @Test
    public void testConverter(){
        dollar.setDollar(3.10);
        double buyDollar = CurrencyConverter.dollarToReal(dollar.getDollar(),200.00);
        assertEquals(657.20, buyDollar,0.05);
    }
}
