package lista2_exercicios;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args){
        int a,b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o inteiro de A: ");
        a = scanner.nextInt();

        System.out.print("Digite o inteiro de B: ");
        b = scanner.nextInt();

        if (saoMultiplos(a,b))
            System.out.println("São multiplos");
        else
            System.out.println("Não são multiplos");
    }
    public static boolean saoMultiplos(int a, int b){
        return a % b == 0 || b % a == 0;
    }
}
