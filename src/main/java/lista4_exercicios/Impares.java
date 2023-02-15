package lista4_exercicios;

import java.util.Scanner;

public class Impares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int impar = 0;
        int x = scanner.nextInt();
        for (int i = 1; i <= x; i+=2){
                System.out.println(i);
        }
        scanner.close();
    }
}

