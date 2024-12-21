package Exercicios.Ex03;

public class CurrencyCalculator {
    public static final double iofTax = 1.06;

    public static double dollarPriceCalculator (double dollarPrice, double dollarBought){
        return (dollarPrice * dollarBought) * iofTax;
    }
}
