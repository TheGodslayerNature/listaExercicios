package lista7_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class VectorSum {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números voce vai digitar? ");
        int times = scanner.nextInt();
        double[] vector = new double[times];
        for (int i = 0; i < times; i++) {
            vector[i] = scanner.nextDouble();
        }
        StringBuilder value = new StringBuilder();
        for (Double values: vector){
            value.append(values.toString()).append(" ");
        }
        System.out.print("values = " + value);
        System.out.println("\nSoma = " + getSum(vector));
        System.out.println("Media = " + getAverage(vector));
    }
    public static double getSum(double[] numbers){
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }
    public static double getAverage(double[] numbers){
        return getSum(numbers) / numbers.length;
    }
}
