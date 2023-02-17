package lista7_exercicios;

import java.util.Arrays;
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
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextDouble();
        }
        System.out.print("Media do vetor = " + getAverage(vetor));
        System.out.println("\nElementos abaixo da média: ");
        System.out.println(Arrays.toString(getBelowAverage(vetor)));
        scanner.close();
    }
    public static double getAverage(double[] vector){
        double total = 0;
        for (double n: vector){
            total += n;
        }
        return total / vector.length;
    }
    public static double[] getBelowAverage(double[] vector){
        double[] below;
        below = new double[getQuantityOfBelowAverage(vector)];
        int index = 0;
        for (double num : vector) {
            if (num < getAverage(vector)) {
                below[index++] = num;
            }
        }
        return below;
    }
    public static int getQuantityOfBelowAverage(double[] vector){
        double mean = getAverage(vector);
        int numberOfTimes = 0;
        for (double v : vector) {
            if (v < mean) {
                numberOfTimes++;
            }
        }
        return numberOfTimes;
    }
}
