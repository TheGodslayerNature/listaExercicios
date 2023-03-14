package secao13.exercicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class OrderProgram {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.ENGLISH);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();;

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = dateFormat.parse(scanner.nextLine());

        Client client = new Client(name, email, birthDate);

        System.out.print("Enter order date:");
        OrderStatus status = OrderStatus.PROCESSING;

        System.out.print("How many items will have this order? ");
        int orderQuantity = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        String dateMoment = dateFormat.format(calendar.getTime());

        Date moment = dateFormat.parse(dateMoment);

        Order order = new Order(moment, status, client);

        for (int i = 1; i <= orderQuantity; i++) {
            scanner.nextLine();
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = scanner.nextLine();

            System.out.print("Product price: ");
            double productPrice = scanner.nextDouble();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            order.addItem(new OrderItem(quantity, new Product(productName, productPrice)));
        }

        System.out.println(order.toString());
    }
}
