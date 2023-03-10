package secao13;

import secao13.enums.WorkerLevel;

import java.util.ArrayList;
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
        for (HourContract contract: hourContractList){
            if (month == contract.getDate().getMonth() && year == contract.getDate().getYear()){
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
