package lista2_exercicios;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.print("Digite um número positivo ou negativo: ");
        numero = scanner.nextInt();

        if (isPositive(numero))
            System.out.println("NÃO NEGATIVO");
        else
            System.out.println("NEGATIVO");
        scanner.close();
    }
    public static boolean isPositive(int inteiro){
        return inteiro >= 0;
    }
}
