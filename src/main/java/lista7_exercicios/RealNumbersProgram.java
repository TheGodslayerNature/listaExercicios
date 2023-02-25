package lista7_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class RealNumbersProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        int quantity  = scanner.nextInt();
        double[] vetor = new double[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextDouble();
        }
        System.out.println("Maior valor = " + getGreatestValue(vetor));
        System.out.println("Posição do maior valor = " + greatestValueIndice(vetor));

        scanner.close();
    }
    public static int greatestValueIndice(double[] numbers){
        double maior = numbers[0];
        int indice = 0;

        for (int i=1; i< numbers.length; i++) {

            if (numbers[i] > maior) {
                maior = numbers[i];
                indice = i;
            }
        }
        return indice;
    }
    public static double getGreatestValue(double[] numbers){
        double maior = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (maior < numbers[i]){
                maior = numbers[i];
            }
        }
        return maior;
    }
}
