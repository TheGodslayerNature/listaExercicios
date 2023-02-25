package employer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestEmployer {
    @Test
    public void testEmployer(){
        Employer employer = new Employer(555, "Marco", 300.00);
        assertEquals("Marco",employer.getName());
        assertEquals(555,employer.getId());
        assertEquals(300.00,employer.getSalary(),0.05);
    }
    @Test
    public void testPercent(){
        Employer employer = new Employer(536, "Alex grey", 3000.00);
        employer.increaseSalary(536, 10.00);
        assertEquals(3300.00, employer.getSalary(), 0.05);
    }
}
