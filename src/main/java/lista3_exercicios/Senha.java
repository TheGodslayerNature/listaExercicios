package lista3_exercicios;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senha;
        System.out.print("Digite a senha: ");
        senha = scanner.nextInt();
        while (senha != 2002){
            System.out.print("Senha incorreta, Digite novamente: ");
            senha = scanner.nextInt();
        }
        System.out.print("Acesso permitido");
    }
}
