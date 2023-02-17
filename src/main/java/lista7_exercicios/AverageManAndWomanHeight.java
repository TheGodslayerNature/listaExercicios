package lista7_exercicios;

import java.util.Scanner;

public class AverageManAndWomanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantas pessoas serão digitadas? ");
        int quantity = scanner.nextInt();

        double altura;
        char genero;
        double[] alturas = new double[quantity];
        Character[]  generos = new Character[quantity];

        for (int i = 0; i < quantity; i++) {
            int count = i + 1;
            System.out.print("Altura da " + count + " pessoa: ");
            altura = scanner.nextDouble();
            alturas[i] = altura;

            System.out.print("Genero da " + count + " pessoa: ");
            genero = scanner.next().charAt(0);
            generos[i] = genero;
        }
        double maior = alturas[0];
        double menor = alturas[0];

        for (int i = 1; i < quantity; i++) {
            if (maior < alturas[i]){
                menor = maior;
                maior = alturas[i];
            }
        }

        System.out.printf("Menor altura = %.2f%n",menor);
        System.out.printf("Maior altura = %.2f%n",maior);

        double meninas = 0;
        double numeroDeMeninas = 0;
        int numerosDeHomens = 0;
        for (int i = 0; i < quantity; i++) {
            if (generos[i].equals('F') || generos[i].equals('f')){
                numeroDeMeninas++;
                meninas += alturas[i];
            }
            else if (generos[i].equals('M') || generos[i].equals('m')){
                numerosDeHomens++;
            }
        }
        System.out.printf("Media das alturas das mulheres = %.2f%n",meninas / numeroDeMeninas);
        System.out.println("Numero de homens = " + numerosDeHomens);

        scanner.close();
    }
}
