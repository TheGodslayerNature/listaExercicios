package lista1_exercicios;

import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class QuintoExercicio {
    public static void main(String[] args){
        Locale.setDefault(Locale.ENGLISH);
        int codigo1,codigo2,pecasQuantidade1,pecasQuantidade2;
        double valorUnitario1, valorUnitario2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o codigo da peça1: ");
        codigo1 = scanner.nextInt();

        System.out.print("Digite a quantidade de peças1: ");
        pecasQuantidade1 = scanner.nextInt();

        System.out.print("Digite o valor unitario da peça1: ");
        valorUnitario1 = scanner.nextDouble();

        System.out.print("Digite o codigo da peça2: ");
        codigo2 = scanner.nextInt();

        System.out.print("Digite a quantidade de peças2: ");
        pecasQuantidade2 = scanner.nextInt();

        System.out.print("Digite o valor unitario da peça2: ");
        valorUnitario2 = scanner.nextDouble();

        String resultado = pagarPecasTotal(pecasQuantidade1,valorUnitario1,pecasQuantidade2,valorUnitario2);
        System.out.println(resultado);
    }
    public static double pagarPecas1(int pecasQuantidade, double valorUnitario){
        return pecasQuantidade * valorUnitario;
    }
    public static double pagarpecas2(int pecasQuantidade, double valorUnitario){
        return pecasQuantidade * valorUnitario;
    }
    public static String pagarPecasTotal(int pecasQuantidade1, double valorUnitario1, int pecasQuantidade2, double valorUnitario2){
        Locale.setDefault(Locale.ENGLISH);
        double resultado = pagarPecas1(pecasQuantidade1, valorUnitario1) + pagarpecas2(pecasQuantidade2, valorUnitario2);
        return new Formatter().format("VALOR A PAGAR: R$ %.2f", resultado).toString();
    }
}
