package secao13;


import secao13.enums.WorkerLevel;

import java.util.Date;
import java.util.Scanner;

public class WorkerProgram {
    public static void main(String[] args) {
        Worker worker;
        Scanner scanner = new Scanner(System.in);
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

            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Enter year: ");
            int year = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter month: ");
            int month = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter day: ");
            int day = scanner.nextInt();
            scanner.nextLine();

            Date date = new Date(year,month,day);
            System.out.print("value per hour: ");
            double perHour = scanner.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = scanner.nextInt();

            contracts = new HourContract(date,perHour,duration);
            worker.addContract(contracts);
        }

        System.out.print("Enter month and year to calculate income: ");
        int month = scanner.nextInt();
        int year = scanner.nextInt();;

        System.out.println(worker.toString());
        System.out.println("Income for " + month + "/" + year + ": " + worker.income(year,month));
    }
}
