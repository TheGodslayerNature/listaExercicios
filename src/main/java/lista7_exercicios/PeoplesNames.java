package lista7_exercicios;

import java.util.Scanner;

public class PeoplesNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas pessoas você vai digitar? ");
        int quantity = scanner.nextInt();
        String name;
        int idade;
        Pessoa[] pessoas = new Pessoa[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.println("Dados da " + i + " pessoa");
            scanner.nextLine();
            System.out.print("nome: ");
            name = scanner.nextLine();
            System.out.print("Idade: ");
            idade = scanner.nextInt();
            pessoas[i] = new Pessoa(name, idade);
        }
        Pessoa pessoa = pessoas[0];
        int maior = 0;
        for (Pessoa value : pessoas) {
            if (value.getAge() > pessoa.getAge()) {
                pessoa = value;
                maior = pessoa.getAge();
            }
        }
        System.out.println(pessoa.getName());
        System.out.println(maior);
        System.out.printf("Pessoa mais velha: %s", pessoa.getName());
    }
}
