package lista2_exercicios;

import java.util.Scanner;

public class PlanoCartesiano {
    public static void main(String[] args) {
        double coordenadaX, coordenadaY;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a coordenada X: ");
        coordenadaX = scanner.nextDouble();

        System.out.print("Digite a coordenada Y: ");
        coordenadaY = scanner.nextDouble();

        String resultado = coordenadas(coordenadaX,coordenadaY);
        System.out.println(resultado);
    }
    public static String coordenadas(double coordenadaX, double coordenadaY){
        if (coordenadaX > 0.0 && coordenadaY > 0.0) {
            return "Q1";
        } 
        else if (coordenadaX < 0.0 && coordenadaY > 0.0) {
            return "Q2";
        }
        else if (coordenadaX < 0.0 && coordenadaY < 0.0) {
            return "Q3";
        }
        else if (coordenadaX > 0.0 && coordenadaY < 0.0) {
            return "Q4";
        }
        return "Origem";
    }
}
