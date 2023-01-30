import java.util.Scanner;

public class SegundaEntradaDeDados {
     public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         int value;
         String x, y, v;
         value = scanner.nextInt();
         scanner.nextLine();
         x = scanner.nextLine();
         y = scanner.nextLine();
         v = scanner.nextLine();
         System.out.println(value);
         System.out.println(x);
         System.out.println(y);
         System.out.println(v);
         scanner.close();
     }
}
