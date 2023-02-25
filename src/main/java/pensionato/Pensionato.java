package pensionato;

import java.util.Scanner;

public class Pensionato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many rooms will be rented? ");
        int rent = scanner.nextInt();
        String name,email;
        Student[] vector = new Student[10];

        for (int i = 0; i < rent; i++) {
            System.out.print("name? ");
            name = scanner.next();
            System.out.print("email? ");
            email = scanner.next();
            System.out.print("Room: ");
            int room = scanner.nextInt();
            vector[room] = new Student(name,email);
        }
        System.out.println("Busy rooms:");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != null){
                System.out.printf(i+" %s, %s%n", vector[i].getName(), vector[i].getEmail());
            }
        }
        scanner.close();
    }
}
