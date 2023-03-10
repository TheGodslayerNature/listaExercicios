package secao13;

import secao13.enums.WorkerLevel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private final String name;
    private final WorkerLevel level;
    double baseSalary;
    private final Department department;
    private final List<HourContract> hourContractList = new ArrayList<>();
    public Worker(String name, WorkerLevel level, double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }
    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void addContract(HourContract contract){
        hourContractList.add(contract);
    }
    public void removeContract(HourContract contract){
        hourContractList.remove(contract);
    }
    public double income(Integer year, Integer month){
        double total = baseSalary;
        Calendar calendar = Calendar.getInstance();

        for (HourContract contract: hourContractList){
            calendar.setTime(contract.getDate());
            int y = calendar.getWeekYear();
            int m = 1 + calendar.get(Calendar.MONTH);
            if (month == m  && year == y){
                total += contract.totalValue();
            }
        }
        return total;
    }

    @Override
    public String toString() {
        return "Name: " + name + '\n' +
                "Department: " + department.getName();
    }
}
