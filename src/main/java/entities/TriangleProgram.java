package entities;

import java.util.Locale;
import java.util.Scanner;

public class TriangleProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        Triangle x, y;
        x = new Triangle(0.0,0.0,0.0);
        y = new Triangle(0.0,0.0,0.0);
        System.out.println("Digite as medidas do triangulo x: ");
        x.setA(scanner.nextDouble());
        x.setB(scanner.nextDouble());
        x.setC(scanner.nextDouble());
        System.out.printf("entities.Triangle X area: %.4f%n",x.areaCalculate());

        System.out.println("Digite as medidas do triangulo y: ");
        y.setA(scanner.nextDouble());
        y.setB(scanner.nextDouble());
        y.setC(scanner.nextDouble());
        System.out.printf("entities.Triangle Y area: %.4f%n",y.areaCalculate());
        if (x.areaCalculate() > y.areaCalculate()){
            System.out.println("areaX é maior");
        } else {
            System.out.println("areaY é maior");
        }
        scanner.close();
    }

}
