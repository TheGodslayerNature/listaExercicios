package lista4_exercicios;

import java.util.Scanner;

public class Linhas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linha = scanner.nextInt();
        for (int i = 1; i <= linha; i ++){
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.println(i + " " + quadrado + " " + cubo);
        }
        scanner.close();
    }
}
