package lista7_exercicios;

import java.util.Scanner;

public class NegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos números");
        int n = scanner.nextInt();
        int quantity = 0;
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            int num = scanner.nextInt();
            if (isANegativeNumber(num)){
                quantity++;
                numbers[i] = num;
            }
        }
        int[] negativeNumbers = new int[quantity];
        int i = 0;
        for(int negative: numbers){
            if (isANegativeNumber(negative)){
                negativeNumbers[i++] = negative;
            }
        }
        System.out.println("Negative Numbers:");
        for (int j : negativeNumbers) {
            System.out.println(j);
        }
    }
    public static boolean isANegativeNumber(int number){
        return number < 0;
    }
}
