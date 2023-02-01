package lista3_exercicios;

import java.util.Scanner;

public class Combustiveis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alcool = 1;
        int gasolina = 1;
        int diesel = 1;
        int numeroProduto;
        System.out.print("Digite um número: ");
        numeroProduto = scanner.nextInt();
        while (numeroProduto != 4){
            switch (abastecimento(numeroProduto)) {
                case "Alcool" -> {
                    System.out.println(abastecimento(numeroProduto) + ": " + alcool++);
                }
                case "Gasolina" -> {
                    System.out.println(abastecimento(numeroProduto) + ": " + gasolina++);
                }
                case "Diesel" -> {
                    System.out.println(abastecimento(numeroProduto) + ": " + diesel++);
                }
            }
            numeroProduto = scanner.nextInt();
        }
    }
    public static String abastecimento(int combustivel){
        return switch (combustivel){
            case 1 -> "Alcool";
            case 2 -> "Gasolina";
            case 3 -> "Diesel";
            case 4 -> "MUITO OBRIGADO";
            default -> "";
        };
    }
}
