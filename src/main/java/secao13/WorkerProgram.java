package secao13;


import secao13.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class WorkerProgram {
    public static void main(String[] args) throws ParseException {
        Worker worker;
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String department = scanner.nextLine();

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Level: ");
        String level = scanner.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("How many contracts to this worker? ");
        int contract = scanner.nextInt();

        HourContract contracts;
        worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));

        for (int i = 1; i <= contract; i++) {
            scanner.nextLine();
            System.out.println("Enter contract #" + i + " data:");
            System.out.println("Date (dd/MM/yyyy)");
            Date date = dateFormat.parse(scanner.nextLine());

            System.out.print("value per hour: ");
            double perHour = scanner.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = scanner.nextInt();

            contracts = new HourContract(date,perHour,duration);
            worker.addContract(contracts);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scanner.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println(worker.toString());
        System.out.println("Income for " + month + "/" + year + ": " + worker.income(year,month));
    }
}
