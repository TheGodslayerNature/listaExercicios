package lista4_exercicios;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fatorial = scanner.nextInt();
        System.out.println(factor(fatorial));
    }
    public static int factor(int fatorial){
        int n = fatorial;
        int soma = 1;
        while (n>=1){
            int calculo = (fatorial - --n);
            soma *= calculo;
        }
        return soma;
    }
}
