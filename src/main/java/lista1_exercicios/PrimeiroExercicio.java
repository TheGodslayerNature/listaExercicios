package lista1_exercicios;

import java.util.Scanner;

public class PrimeiroExercicio {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int valorA, valorB, resultado;

        System.out.println("Digite o valor de a");
        valorA = scanner.nextInt();

        System.out.println("Digite o valor de b");
        valorB = scanner.nextInt();

        resultado = soma(valorA , valorB);
        System.out.printf("A soma do valor a e valor b é: " + resultado);

    }
    public static int soma(int valorA, int valorB){
        return valorA + valorB;
    }
}
