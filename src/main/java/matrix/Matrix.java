package matrix;

public class Matrix {
    public static int[][] multiMatrix(int m, int n){
        return new int[m][n];
    }

    public static String checkPosition(int[][] matrix, int value){
        String position = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == value){
                    position = "Position " + i + ", " + j;
                }
            }
        }
        return position;
    }
}
