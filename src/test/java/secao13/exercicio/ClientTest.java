package secao13.exercicio;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class ClientTest {
    Calendar calendar = Calendar.getInstance();
    Client client = new Client("jão", "bb@gmail.com", calendar.getTime());

    @Test
    public void testName(){
        assertEquals("jão", client.getName());
    }
    @Test
    public void testEmail(){
        assertEquals("bb@gmail.com", client.getEmail());
    }
    @Test
    public void testBirthDate(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000,Calendar.FEBRUARY,13);
        Client client = new Client("jão", "bb@gmail.com", calendar.getTime());

        Date expected = calendar.getTime();
        assertEquals(expected, client.getBirthDate());
    }
}
