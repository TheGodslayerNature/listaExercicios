package lista7_exercicios;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestAverageManAndWomanHeight {
    @Test
    public void testAverageWomanHeight(){
        Pessoa terra = new Pessoa("Terra", 89, 1.70);
        Pessoa branford = new Pessoa("Branford", 59, 1.82);

        Pessoa strix = new Pessoa("Strix", 153, 1.75);
        Pessoa livith = new Pessoa("Livith", 22, 1.61);
        Pessoa[] mulheres =  { terra, branford, livith, strix};
        assertEquals(1.69, AverageManAndWomanHeight.womanAverageHeight(mulheres),0.05);
    }
    @Test
    public void testIsWoman(){
        char man = 'M';
        char woman = 'F';
        assertFalse(AverageManAndWomanHeight.isWoman(man));
        assertTrue(AverageManAndWomanHeight.isWoman(woman));
    }
}
