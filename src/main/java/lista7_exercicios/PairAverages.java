package lista7_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class PairAverages {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int quantity = scanner.nextInt();
        int evenQuantity = 0;
        double totalEven = 0;
        double[] vetor = new double[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextDouble();
        }
        for (int i = 0; i < quantity; i++) {
            if (vetor[i] % 2 == 0){
                evenQuantity++;
                totalEven += vetor[i];
            }
        }

        if (totalEven == 0){
            System.out.println("NENHUM NUMERO PAR");
        }
        else {
            System.out.println("media dos pares " + totalEven / evenQuantity);
        }
    }
}
