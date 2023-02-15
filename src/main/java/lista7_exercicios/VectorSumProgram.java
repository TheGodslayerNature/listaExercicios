package lista7_exercicios;

import java.util.Scanner;

public class VectorSumProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite os valores de cada vetor? ");
        int quantity = scanner.nextInt();
        int[] vetorA = new int[quantity];
        int[] vetorB = new int[quantity];
        int[] vetorC = new int[quantity];
        for (int i = 0; i < quantity; i++) {
            System.out.print("Digite os valores do vetor A: ");
            vetorA[i] = scanner.nextInt();
        }
        for (int i = 0; i < quantity; i++) {
            System.out.print("Digite os valores do vetor B: ");
            vetorB[i] = scanner.nextInt();
        }
        for (int i = 0; i < quantity; i++) {
            vetorC[i] = vetorA[i] + vetorB[i];
        }
        System.out.println("Vetor Resultante");
        for (int i = 0; i < quantity; i++) {
            System.out.println(vetorC[i]);
        }
    }
}
