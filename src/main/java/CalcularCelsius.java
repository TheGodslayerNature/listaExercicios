import java.util.Locale;
import java.util.Scanner;

public class CalcularCelsius {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);

        char res = 's';
        while (res == 's'){
            System.out.print("Digite a temperatura em celsius: ");
            double c = scanner.nextDouble();
            double f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("O equivalente em Fahrenheit: %.1f%n", f);
            System.out.println("Deseja continuar s/n");
            res = scanner.next().charAt(0);
        }
        scanner.close();
    }
}
