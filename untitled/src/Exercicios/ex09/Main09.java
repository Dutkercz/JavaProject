package Exercicios.ex09;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Person> list = new ArrayList<>();
        Double totalTax = 0.0;

        System.out.println("Enter the number of tax payers: ");
        int numberOfTaxPayers = scan.nextInt();
        scan.nextLine();

        for (int i = 1; i <= numberOfTaxPayers; i++) {
            System.out.println("\nEnter tax payer #" +i+ " data.\n");
            System.out.print("Individual or Company: (I or C) ");
            var choice = scan.next().toUpperCase().charAt(0);
            scan.nextLine();
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Anual income: ");
            double annualIncome = scan.nextDouble();

            if (choice == 'I'){
                System.out.print("Healthcare expenditures: ");
                double healthExpenses = scan.nextDouble();
                list.add(new NaturalPerson(name, annualIncome, healthExpenses));
            }else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = scan.nextInt();
                list.add(new LegalPerson(name, annualIncome, numberOfEmployees));
            }
        }
        for (Person c : list){
            totalTax += c.totalTribute();
        }

        System.out.println("\n|TAXES PAID|\n");
        for (Person c : list){
            System.out.printf("Name %s US$ %.2f %n", c.getName(), c.totalTribute());
        }
        System.out.printf("\n>>>>>>> Total taxes US$ %.2f", totalTax);

    }
}
