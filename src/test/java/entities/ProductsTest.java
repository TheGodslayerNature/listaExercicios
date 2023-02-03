package entities;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductsTest {
    Products maca = new Products();
    @Test
    public void testProducts(){
        maca.setName("maça");
        assertEquals("maça", maca.getName());
    }
    @Test
    public void testPrice(){
        maca.setPrice(2.50);
        assertEquals(2.50, maca.getPrice(),0.005);
    }
    @Test
    public void testQuantity(){
        maca.setQuantity(9);
        assertEquals(9, maca.getQuantity());
        maca.addProducts(2);
        assertEquals(11, maca.getQuantity());
        maca.removeProducts(5);
        assertEquals(6, maca.getQuantity());
    }
}
