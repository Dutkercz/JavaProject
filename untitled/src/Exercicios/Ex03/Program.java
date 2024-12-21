package Exercicios.Ex03;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("What is the dollar price: US$ ");
        double dollarPrice = scan.nextDouble();

        System.out.print("How many dollars will be bought: US$ ");
        double dollarBought = scan.nextDouble();

        double totalInReais = CurrencyCalculator.dollarPriceCalculator(dollarPrice, dollarBought);

        System.out.printf("Total to be paid in Reais: R$ %.2f" , totalInReais);



    }
}
