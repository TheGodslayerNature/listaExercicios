package lista5_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class StudentProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.print("Digite seu nome: ");
        student.setName(scanner.nextLine());

        System.out.print("Digite sua primeira nota: ");
        student.setFirstGrade(scanner.nextDouble());

        System.out.print("Digite sua segunda nota: ");
        student.setSecondGrade(scanner.nextDouble());

        System.out.print("Digite sua terceira nota: ");
        student.setThirdGrade(scanner.nextDouble());

        System.out.printf("FINAL GRADE = %.2f%n%s",student.finalGrade(),student.pointsMissing());
        scanner.close();
    }
}
