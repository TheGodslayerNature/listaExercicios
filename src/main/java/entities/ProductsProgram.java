package entities;

import java.util.Locale;
import java.util.Scanner;

public class ProductsProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);

        Products product = new Products();
        System.out.println("Enter product data");
        System.out.print("Enter product name: ");
        product.setName(scanner.nextLine());
        System.out.print("Enter product price: ");
        product.setPrice(scanner.nextDouble());
        System.out.print("Enter product quantity: ");
        product.setQuantity(scanner.nextInt());

        System.out.println("Name " + product.getName());
        System.out.println("Price " + product.getPrice());
        System.out.println("Quantity in stock " + product.getQuantity());
        System.out.println("Product data: " + product);
        scanner.close();
    }
}
