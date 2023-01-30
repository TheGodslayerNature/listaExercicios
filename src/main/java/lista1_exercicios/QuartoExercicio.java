package lista1_exercicios;

import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class QuartoExercicio {
    public static void main(String[] args){
        Locale.setDefault(Locale.ENGLISH);
        int funcionarioNumber, horasTrabalhadas;
        double valorporHoras;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de funcionario: ");
        funcionarioNumber = scanner.nextInt();

        System.out.print("Digite o número de horas trabalhadas: ");
        horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o valor que receber por hora trabalhada: ");
        valorporHoras = scanner.nextDouble();

        String resultado = funcionarioDado(funcionarioNumber,horasTrabalhadas,valorporHoras);

        System.out.println(resultado);
        scanner.close();
    }
    public static String funcionarioDado(int funcionarioNumber, int horasTrabalhadas, double valorPorhora){
        Locale.setDefault(Locale.ENGLISH);

        double calculoDeHoras = horasTrabalhadas * valorPorhora;
        String horasResultado = new Formatter().format("%.2f", calculoDeHoras).toString();

        return "NUMBER = " + funcionarioNumber + "\nSALARY = U$ "+ horasResultado;
    }
}
