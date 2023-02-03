package lista4_exercicios;

import java.util.Scanner;

public class Dividindo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            double numererador = scanner.nextDouble();
            double denominador = scanner.nextDouble();
            double divisao = numererador / denominador;
            String resultado = (denominador == 0) ? "divisão impossivel" : "" + divisao;
            System.out.println(resultado);
        }
        scanner.close();
    }
}
