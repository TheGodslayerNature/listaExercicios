package secao13.exercicio;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class OrderTest {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    Order order;
    @Test
    public void testMoment() throws ParseException {
        Date moment = dateFormat.parse("25/04/2020 20:30:25");
        Order order = new Order(moment, OrderStatus.DELIVERED,new Client(null,null,null));

        Date expected = dateFormat.parse("25/04/2020 20:30:25");
        assertEquals(expected, order.getMoment());
    }
    @Test
    public void testAddItem() throws ParseException {
        Date moment = dateFormat.parse("14/05/2020 13:15:23");
        Order order = new Order(moment, OrderStatus.DELIVERED,new Client(null,null,null));

        order.addItem(new OrderItem(1,new Product("pastel",5.50)));
        assertEquals(5.50, order.getItems().get(0).subTotal(),0.05);
    }
    @Test
    public void testRemoveItem() throws ParseException {
        Date moment = dateFormat.parse("15/12/2021 12:50:45");
        order = new Order(moment, OrderStatus.PROCESSING, new Client(null,null,null));
        order.addItem(new OrderItem(2, new Product("maça", 1.50)));
        assertEquals(3.0, order.getItems().get(0).subTotal(),0.05);
        order.removeItem(order.getItems().get(0));
        assertTrue(order.getItems().isEmpty());
    }
    @Test
    public void testOrderClient() throws ParseException {
        Date moment = dateFormat.parse("15/12/2021 12:50:45");
        SimpleDateFormat birth = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDate = birth.parse("02/04/1955");
        Client client =  new Client("Ramus","ramus@gmail.com", birthDate);
        Order clientOrder = new Order(moment, OrderStatus.DELIVERED, client);
        assertTrue(clientOrder.hasClient());
    }
    @Test
    public void testTotal() throws ParseException {
        Date moment = dateFormat.parse("15/12/2021 12:50:45");
        SimpleDateFormat birth = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDate = birth.parse("02/04/1955");
        Client client =  new Client("Ramus","ramus@gmail.com", birthDate);
        Order order1 = new Order(moment, OrderStatus.DELIVERED, client);
        order1.addItem(new OrderItem(4,new Product("batata", 0.50)));
        order1.addItem(new OrderItem(2,new Product("laranja", 1.75)));
        assertEquals(5.5, order1.total(),0.05);
    }
}
