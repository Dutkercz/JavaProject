package Anotacoes;

import java.util.Locale;

public class Anotacao02 {
    public static void main(String[] args) {

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        var code = 5298;
        String gender = "F";

        var price1 = 2100.0;
        var price2 = 650.60;
        var measure = 53.234567;

        System.out.println("Products");
        System.out.printf("%s, which price is $ %.2f .%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f .%n", product2, price2);
        System.out.println();

        System.out.printf("Record: %d year old, code %d and gender: %s\n", age, code, gender);
        System.out.println();

        System.out.printf("Measure with eight decimal places: %.8f\n", measure);
        System.out.printf("Rounded (three places): %.2f\n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point %.3f", measure);

    }
}
