package lista2_exercicios;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args){
        int inteiro;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        inteiro = scanner.nextInt();

        if (isPar(inteiro))
            System.out.println("PAR");
        else
            System.out.println("IMPAR");
    }
    public static boolean isPar(int inteiro){
        return inteiro % 2 == 0;
    }
}
