package lista1_exercicios;

import java.util.Scanner;

public class TerceiroExercicio {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int A,B,C,D;
        System.out.print("Digite o produto de A: ");
        A = scanner.nextInt();
        System.out.print("Digire o produto de B: ");
        B = scanner.nextInt();
        System.out.print("Digire o produto de C: ");
        C = scanner.nextInt();
        System.out.print("Digire o produto de D: ");
        D = scanner.nextInt();

        int resultado = diferenca(A,B,C,D);
        System.out.println("A diferença é igual a = " + resultado);
        scanner.close();
    }
    public static int diferenca(int a, int b, int c, int d){
        return a * b - c * d;
    }
}
