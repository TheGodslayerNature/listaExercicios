package secao13;

import org.junit.Test;
import secao13.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class WorkerTest {
    @Test
    public void testWorkerIncome() throws ParseException {
        Worker worker = new Worker("Alex", WorkerLevel.MID_LEVEL, 1200.00, new Department("Design"));
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        HourContract contract = new HourContract(dateFormat.parse("20/08/2018"), 50.00,20);
        HourContract contract2 = new HourContract(dateFormat.parse("25/08/2018"), 80.00,10);
        worker.addContract(contract);
        worker.addContract(contract2);

        assertEquals(3000, worker.income(2018, 8),0.05);

    }
}
