package org.example;

import java.util.Formatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        String products = new Formatter().format("Products:%n%s, which price is $ %.2f %n" +
                "%s, which price is %.2f",product1,price1,product2,price2).toString();

        String record = new Formatter().format("%n %nRecord: %d years old, code %d and gender: %s",age,code,gender).toString();

        String measue = new Formatter().format("Measue with eight decimal places: %f %n" +
                "Rouded (three decimal places): %.3f %n", measure, measure).toString();
        Locale.setDefault(Locale.ENGLISH);

        String us = new Formatter().format("US decimal point: %.3f",measure).toString();

        System.out.println(products + record + measue + us);

    }
}