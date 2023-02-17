package lista7_exercicios;

import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas pessoas você vai digitar? ");
        int quantity = scanner.nextInt();
        Pessoa[] pessoas = new Pessoa[quantity];
        for (int i = 0; i < quantity; i++) {
            int numeroPessoa = i + 1;
            System.out.println("Dados da " + numeroPessoa + " pessoa");
            scanner.nextLine();
            System.out.print("nome: ");
            String name = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            pessoas[i] = new Pessoa(name, idade);
        }
        System.out.printf("Pessoa mais velha: %s", getPessoaMaisVelha(pessoas));

        scanner.close();
    }
    public static String getPessoaMaisVelha(Pessoa[] pessoas){
        Pessoa maisVelho = pessoas[0];
        for (int i = 1; i < pessoas.length; i++) {
            if (maisVelho.getAge() < pessoas[i].getAge()){
                maisVelho = pessoas[i];
            }
        }
        return maisVelho.getName();
    }
}
