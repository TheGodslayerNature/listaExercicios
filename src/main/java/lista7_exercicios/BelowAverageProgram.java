package lista7_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class BelowAverageProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos elementos vai ter o vetor? ");
        int quantity = scanner.nextInt();
        double[] vetor = new double[quantity];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextDouble();
        }
        System.out.print("Media do vetor = " + getAverage(vetor));
        System.out.println("\nElementos abaixo da média: ");
        for (double media: vetor){
            if (media < getAverage(vetor))
                System.out.println(media);
        }
    }
    public static double getAverage(double[] vector){
        double total = 0;
        for (double n: vector){
            total += n;
        }
        return total / vector.length;
    }
}
