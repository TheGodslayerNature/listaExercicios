package lista2_exercicios;

import java.util.Scanner;

public class HoraDoJogo {
    public static void main(String[] args){
        int inicio, termino;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o inicio do jogo: ");
        inicio = scanner.nextInt();

        System.out.print("Digite o termino do jogo: ");
        termino = scanner.nextInt();

        int resultado = duracao(inicio, termino);
        System.out.println("O JOGO DUROU " + resultado + " HORA(S)");
    }
    public static int duracao(int inicio,int termino){
        int duracaoTotalDoJogo = 24;
        int tempoDeJogo = inicio - termino;
        int duracao = duracaoTotalDoJogo - tempoDeJogo;
        if (duracao > duracaoTotalDoJogo)
            return termino - inicio;
        return duracaoTotalDoJogo - tempoDeJogo;
    }
}
