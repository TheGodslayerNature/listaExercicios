package lista5_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class RetanguloProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        System.out.print("Digite a altura: ");
        retangulo.setHeight(scanner.nextDouble());
        System.out.print("Digite a base: ");
        retangulo.setWidth(scanner.nextDouble());
        System.out.printf("area = %.2f%nPerimeter = %.2f%nDiagonal = %.2f", retangulo.area(), retangulo.perimeter(), retangulo.diagonal());

    }
}
