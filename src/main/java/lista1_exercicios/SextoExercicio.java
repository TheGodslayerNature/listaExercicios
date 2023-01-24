package lista1_exercicios;

import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class SextoExercicio {
    public static void main(String[] args){
        Locale.setDefault(Locale.ENGLISH);
        double A,B,C;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite A: ");
        A = scanner.nextDouble();

        System.out.print("Digite B: ");
        B = scanner.nextDouble();

        System.out.print("Digite C: ");
        C = scanner.nextDouble();

        String resultado = area(A,B,C);
        System.out.println(resultado);
    }
    public static String area(double A,double B, double C){
        Locale.setDefault(Locale.ENGLISH);
        double triangulo = (A * C) /2;
        double circulo = Double.parseDouble(SegundoExercicio.raio(C));
        double trapezio = ((A + B) * C) / 2;
        double quadrado = B * B;
        double retangulo = A * B;
        return new Formatter().format("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f", triangulo,circulo,trapezio,quadrado,retangulo).toString();
    }
}
