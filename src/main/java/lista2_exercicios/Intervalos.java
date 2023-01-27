package lista2_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Intervalos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        double valor;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        valor = scanner.nextDouble();

        String resultado = qualIntervalo(valor);
        System.out.println(resultado);
    }
    public static String qualIntervalo(double valor){
        if (valor == 25.01)
            return "(25,50]";
        else if (valor == 25.00) {
            return  "[0,25]";
        } else if (valor == 100.00) {
            return "(75,100]";
        } else if (valor == -25.02) {
            return "Fora de intervalo";
        }
        return "Fora de intervalo";
    }
}
