package lista7_exercicios;

import java.util.Scanner;

public class PessoaProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        double height;
        System.out.println("Quantas pessoas serão digitadas? ");
        int quantity = scanner.nextInt();
        Pessoa[] pessoas = new Pessoa[quantity];
        for (int i = 0; i < quantity; i++) {
            scanner.nextLine();
            System.out.println("Digite o nome");
            name = scanner.nextLine();
            System.out.println("Digite a idade");
            age = scanner.nextInt();
            System.out.println("Digite a altura");
            height = scanner.nextDouble();
            pessoas[i] = new Pessoa(name,age,height);
        }
        System.out.println("average height: " + averageHeight(pessoas));
        System.out.println("People less than 16 years: " + percent(pessoas) + "%");
    }
    public static double percent(Pessoa[] peoples){
        double quantity = 0;
        for (Pessoa people : peoples) {
            if (!people.isLegalAge()) {
                quantity++;
            }
        }
        return (quantity /  peoples.length) * 100;
    }
    public static double averageHeight(Pessoa[] peoples){
        double quantity = 0;
        for (Pessoa people : peoples) {
            quantity += people.getHeight();
        }
        return quantity / peoples.length;
    }
}
