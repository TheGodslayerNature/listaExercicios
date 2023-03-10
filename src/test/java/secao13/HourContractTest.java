package secao13;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HourContractTest {
    @Test
    public void testHourContract(){
        Date date = new Date(20,8,2018);
        HourContract hourContract = new HourContract(date, 50.00,20);
        assertEquals(1000, hourContract.totalValue(),0.05);
    }
    @Test
    public void test2HoursContract(){
        List<HourContract> list = new ArrayList<>();
        Date date = new Date(20,8,2018);
        HourContract design = new HourContract(date, 50.00,20);
        HourContract program = new HourContract(date, 80.00,10);

        list.add(design);
        list.add(program);
        double totalSalary = 0;
        for (HourContract contract: list){
            totalSalary += contract.totalValue();
        }

        assertEquals(3000, totalSalary + 1200, 0.05);
    }
}
