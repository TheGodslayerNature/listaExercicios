package lista6_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AccountProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        int number;
        String name;
        char initialDepositConfirm;
        double initialDeposit;


        Account account;
        System.out.print("Enter account number: ");
        number = scanner.nextInt();
        System.out.print("Enter account holder name: ");
        name = scanner.nextLine();
        name += scanner.nextLine();
        System.out.print("is there initial deposit (y/n)? ");
        initialDepositConfirm = scanner.next().charAt(0);


        if (initialDepositConfirm == 'y'){
            System.out.print("Enter deposit: ");
            initialDeposit = scanner.nextDouble();
            account = new Account(number, name, initialDeposit);
            System.out.printf("\nAccount data%nAccount %d, Holder: %s, Balance: $ %.2f%n",
                    account.getNumberAccount(), account.getNameAccount(),account.getDeposit());

            System.out.print("Enter a deposit value: ");
            account.deposit(scanner.nextDouble());
            System.out.printf("Updated account data%nAccount %d, Holder: %s, Balance: $ %.2f%n",
                    account.getNumberAccount(), account.getNameAccount(),account.getDeposit());

            System.out.print("Enter a withDraw value: ");
            account.withDraw(scanner.nextDouble());
            System.out.printf("Updated account data%nAccount %d, Holder: %s, Balance: $ %.2f%n",
                    account.getNumberAccount(), account.getNameAccount(),account.getDeposit());
        }
        account = new Account(number,name);
        System.out.printf("\nAccount data%nAccount %d, Holder: %s, Balance: $ %.2f%n",
                account.getNumberAccount(), account.getNameAccount(),account.getDeposit());

        System.out.print("\nEnter a deposit value: ");
        account.deposit(scanner.nextDouble());

        System.out.printf("Updated account data%nAccount %d, Holder: %s, Balance: $ %.2f%n",
                account.getNumberAccount(), account.getNameAccount(),account.getDeposit());

        System.out.print("\nEnter a withDraw value: ");
        account.withDraw(scanner.nextDouble());

        System.out.printf("Updated account data%nAccount %d, Holder: %s, Balance: $ %.2f%n",
                account.getNumberAccount(), account.getNameAccount(),account.getDeposit());
    }
}
