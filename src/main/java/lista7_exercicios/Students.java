package lista7_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos alunos serão digitados? ");
        int quantity = scanner.nextInt();
        String nome;
        double nota1, nota2;
        double[] notas1 = new double[quantity];
        double[] notas2 = new double[quantity];
        String[] nomes = new String[quantity];
        for (int i = 0; i < quantity; i++) {
            int count = i + 1;
            scanner.nextLine();
            System.out.print("Digite o nome do " + count + " aluno: ");
            nome = scanner.nextLine();
            nomes[i] = nome;

            System.out.print("Digite a primeria nota do " + count + " aluno: ");
            nota1 = scanner.nextDouble();
            notas1[i] = nota1;

            System.out.print("Digite a segunda nota do " + count + " aluno: ");
            nota2 = scanner.nextDouble();
            notas2[i] = nota2;
        }
        System.out.println("Alunos Aprovados");
        for (int i = 0; i < quantity; i++) {
            if ((notas1[i] + notas2[i]) / 2 >= 6.0){
                System.out.println(nomes[i]);
            }
        }
    }
}
