import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nome;
        System.out.print("Digite um número: ");
        nome = scanner.nextInt();
        String yes = (nome < 10) ? "Alexandre muito massa" : "Samuel vacilão";
        scanner.close();
        System.out.printf(yes);
    }
}
