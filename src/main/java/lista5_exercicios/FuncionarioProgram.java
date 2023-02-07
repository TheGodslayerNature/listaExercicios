package lista5_exercicios;

import java.util.Scanner;

public class FuncionarioProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        System.out.print("Informe seu nome: ");
        funcionario.setName(scanner.nextLine());
        System.out.print("Informe seu salario bruto: ");
        funcionario.setGrossSalary(scanner.nextDouble());
        System.out.print("Informe uma porcentagem: ");
        funcionario.increseSalary(scanner.nextDouble());
        System.out.println(funcionario.toString());
        scanner.close();
    }
}
