package lista5_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ConverterProgam {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        Dollar dollar = new Dollar();
        System.out.print("Qual é o preço do dollar: ");
        dollar.setDollar(scanner.nextDouble());

        System.out.print("Quantos dollares serão comprados: ");
        double quantity = scanner.nextDouble();

        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.dollarToReal(dollar.getDollar(),quantity));
        scanner.close();
    }
}
