package lista7_exercicios;

import java.util.Scanner;

public class PairProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity;
        System.out.print("quantos números voce irá digitar? ");
        quantity = scanner.nextInt();
        int[] numbers = new int[quantity];

        for (int i = 0; i < quantity; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = scanner.nextInt();
        }

        int even = 0;
        System.out.println();
        System.out.println("NUMEROS PARES:");

        for (int n : numbers) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
                even++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + even);
    }
    public static int[] takePairs(int[] numbersArrays){
        int[] pairArray = new int[numbersArrays.length];
        for (int i = 0; i < numbersArrays.length; i++) {
            if (numbersArrays[i] % 2 == 0)
                pairArray[i] = numbersArrays[i];
        }
        return pairArray;
    }
}
