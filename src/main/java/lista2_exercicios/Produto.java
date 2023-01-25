package lista2_exercicios;

import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        int codigo, quantidade;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código: ");
        codigo = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        quantidade = scanner.nextInt();

        double resultado = valorAPagar(codigo, quantidade);
        System.out.println("Total: R$ " + resultado);
    }
    public static double valorAPagar(int codigo,int quantidade){
        return switch (codigo) {
            case 1 -> 4.00 * quantidade;
            case 2 -> 4.50 * quantidade;
            case 3 -> 5.00 * quantidade;
            case 4 -> 2.00 * quantidade;
            case 5 -> 1.50 * quantidade;
            default -> 0.0 * quantidade;
        };
    }
}
