package lista3_exercicios;

import java.util.Scanner;

public class PlanoCartesiano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        System.out.println("Digite x:");
        x = scanner.nextInt();
        System.out.println("Digite y:");
        y = scanner.nextInt();
        while (x !=0 && y != 0){
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
    }
}
