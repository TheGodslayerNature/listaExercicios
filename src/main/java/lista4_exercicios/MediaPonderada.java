package lista4_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double resultado;
        StringBuilder saida = new StringBuilder();
        for (int i = 0; i < n; i++){
            double valor1 = scanner.nextDouble();
            double valor2 = scanner.nextDouble();
            double valor3 = scanner.nextDouble();
            resultado = calcularMedia(valor1, valor2,valor3);
            saida.append(String.format("%.1f\n", resultado));
        }
        System.out.println(saida);
        scanner.close();
    }

    private static double calcularMedia(double valor1, double valor2, double valor3) {
        double calculo1 = valor1 * 2;
        double calculo2 = valor2 * 3;
        double calculo3 = valor3 * 5;
        double soma = calculo1 + calculo2 + calculo3;
        return soma / 10;
    }
}
