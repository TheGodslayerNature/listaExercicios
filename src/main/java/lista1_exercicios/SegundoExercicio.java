package lista1_exercicios;

import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class SegundoExercicio {
    static double pi = 3.14159;
    public static void main(String[] args){
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        double raio;

        System.out.println("Digite o valor do raio");

        raio = scanner.nextDouble();

        String resultado = raio(raio);
        System.out.printf("O resultado é " + resultado);
        scanner.close();
    }
    public static String raio(double raio){
        Locale.setDefault(Locale.ENGLISH);
        raio = raio * raio;
        double resultado = pi * raio;
        return new Formatter().format("%.4f",resultado).toString();
    }

}
