package lista2_exercicios;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProdutoTest {
    @Test
    public void testProduto(){
        assertEquals(4.00, Produto.valorAPagar(1,1),0.005);
        assertEquals(4.50, Produto.valorAPagar(2,1),0.005);
        assertEquals(5.00, Produto.valorAPagar(3,1),0.005);
        assertEquals(2.00, Produto.valorAPagar(4,1),0.005);
        assertEquals(1.50, Produto.valorAPagar(5,1),0.005);
    }
    @Test
    public void testMaisDe1Produto(){
        assertEquals(8.00, Produto.valorAPagar(1,2),0.005);
        assertEquals(10.00, Produto.valorAPagar(3,2),0.005);
        assertEquals(13.50, Produto.valorAPagar(2,3),0.005);
    }
}
