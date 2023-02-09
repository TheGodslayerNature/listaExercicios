package lista6_exercicios;

import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class AccountProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);

        int number;
        String name;
        double initialDeposit;

        Account account;
        System.out.print("Enter account number: ");
        number = scanner.nextInt();

        System.out.print("Enter account holder name: ");
        name = scanner.nextLine();
        name += scanner.nextLine();

        if (initialDepositRequest(scanner.next().charAt(0))){

            System.out.print("Enter deposit: ");
            initialDeposit = scanner.nextDouble();
            account = new Account(number, name, initialDeposit);

            printData(account.getNumberAccount(),account.getNameAccount(),account.getDeposit());

            System.out.print("Enter a deposit value: ");
            account.deposit(scanner.nextDouble());
            printUpdateAccountData(account.getNumberAccount(),account.getNameAccount(),account.getDeposit());

            System.out.print("Enter a withDraw value: ");
            account.withDraw(scanner.nextDouble());

            printUpdateAccountData(account.getNumberAccount(),account.getNameAccount(),account.getDeposit());
            System.exit(0);
        }

        account = new Account(number,name);
        printData(account.getNumberAccount(),account.getNameAccount(),account.getDeposit());

        System.out.print("Enter a deposit value: ");
        account.deposit(scanner.nextDouble());

        printUpdateAccountData(account.getNumberAccount(),account.getNameAccount(),account.getDeposit());

        System.out.print("Enter a withDraw value: ");
        account.withDraw(scanner.nextDouble());

        printUpdateAccountData(account.getNumberAccount(),account.getNameAccount(),account.getDeposit());
    }

    public static void printData(int number, String name,double initialDeposit){
        Formatter formatter = new Formatter();
        formatter.format("Account data%nAccount %d, Holder: %s, Balance: $ %.2f%n",number,name,initialDeposit);
        System.out.println(formatter);
    }
    public static void printUpdateAccountData(int number, String name, double initialDeposit){
        Formatter formatter = new Formatter();
        formatter.format("Updated account data%nAccount %d, Holder: %s, Balance: $ %.2f%n", number, name, initialDeposit);
        System.out.println(formatter);
    }
    public static boolean initialDepositRequest(char yesOrNo){
        return yesOrNo == 'y';
    }
}
