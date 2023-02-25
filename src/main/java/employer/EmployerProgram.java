package employer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployerProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many employees will be registered");
        int empCount = scanner.nextInt();
        String name;
        int id;
        double salary;
        Employer employer;
        List<Employer> employers = new ArrayList<>();
        for (int i = 1; i <= empCount; i++) {
            System.out.println("Employee #" + i);
            System.out.print("write the id: ");
            id = scanner.nextInt();
            System.out.print("write the name: ");
            scanner.nextLine();
            name = scanner.nextLine();
            System.out.print("write the salary: ");
            salary = scanner.nextDouble();
            employer = new Employer(id,name,salary);
            employers.add(employer);
        }
        System.out.print("Enter the employee id that will have salary increase : ");
        id = scanner.nextInt();
        System.out.print("Enter the percentage: ");
        double percentage = scanner.nextDouble();
        for (Employer employer1: employers){
            if (id == employer1.getId()){
                employer1.increaseSalary(id,percentage);
            }
        }
        System.out.println("-----------------");
        for (Employer emplo: employers)
            System.out.println(emplo.getId() + ", " + emplo.getName() + ", " + emplo.getSalary());
        System.out.println("-----------------");
        scanner.close();
    }
}
