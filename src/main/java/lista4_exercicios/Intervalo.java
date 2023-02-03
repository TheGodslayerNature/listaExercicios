package lista4_exercicios;

import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x;
        int countIn = 0;
        int countOut = 0;
        for (int i = 0; i < n; i++){
            x = scanner.nextInt();
            if (x >= 10 && x <= 20){
                countIn++;
            } else {
                countOut++;
            }
        }
        System.out.println(countIn + " in" + '\n' + countOut + " out");
        scanner.close();
    }
}
