package secao13;

import org.junit.Test;
import secao13.enums.WorkerLevel;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class WorkerTest {
    @Test
    public void testWorker(){
        Worker worker = new Worker("Alex", WorkerLevel.MID_LEVEL, 1200.00, new Department("Design"));
        worker.addContract(new HourContract(new Date(2018,8,20), 50.00,20));
        worker.addContract(new HourContract(new Date(2018,8,25), 80.00,10));
        worker.addContract(new HourContract(new Date(2018, Calendar.JULY,15), 80.00,10));

        assertEquals(3000, worker.income(2018, 8),0.05);

        assertEquals("Name: Alex\n" +
                "Department: Design", worker.toString());
    }
}
