package matrix;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m, n, x;
        System.out.print("Digite M: ");
        m = scanner.nextInt();
        System.out.print("Digite N: ");
        n = scanner.nextInt();

        int[][] matrix = multiMatrix(m, n);

        for(int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.print("Digite um número pertencente a matrix: ");
        x = scanner.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (checkValueElement(matrix[i][j], x)){
                    if (checkValueElement(matrix[i][j], x)){
                        System.out.println("Position " + i + ", " + j);
                    }
                    if (checkValueElement(matrix[i][j], x)) {
                        System.out.println("Left " + matrix[i][j - 1]);
                    }
                    if (j < matrix[i].length-1){
                        System.out.println("Right " + matrix[i][j + 1]);
                    }
                    if (i < matrix[i].length) {
                        System.out.println("Down " + matrix[i + 1][j]);
                    }
                    if (i > 0){
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }
                }
            }
        }
        scanner.close();
    }
    public static int[][] multiMatrix(int m, int n){
        return new int[m][n];
    }
    private static boolean checkValueElement(int matrixElement,int value){
        return  matrixElement == value;
    }
    public static String checkPosition(int[][] matrix, int value){
        String position = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (checkValueElement(matrix[i][j],value)){
                    position = "Position " + i + ", " + j;
                }
            }
        }
        return position;
    }
    public static String checkLeft(int[][] matrix, int value){
        String left = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (checkValueElement(matrix[i][j], value)){
                    left = "Left: " + matrix[i][j - 1];
                }
            }
        }
        return left;
    }
}
