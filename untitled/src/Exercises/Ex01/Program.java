package Exercises.Ex01;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double percentageIncreaseSalary;

        System.out.println("Enter employee data: (Name/Salary)");
        Methods employer1 = new Methods("Cristian", 6000.00);

        System.out.println(employer1);

        System.out.print("Which percentage to increase employee salary: ");
        percentageIncreaseSalary = scan.nextDouble();
        employer1.increaseSalary(percentageIncreaseSalary);
        System.out.println();
        System.out.println(employer1);



    }
}
