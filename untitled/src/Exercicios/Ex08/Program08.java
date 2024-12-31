package Exercicios.Ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        System.out.print("How many employees you want to register: ");
        int totalEmployee = scan.nextInt();
        scan.nextLine();
        List<Employee> employeeList = new ArrayList<>();

        for (int i = 1; i <= totalEmployee; i++) {
            System.out.print("Employee outsourced? Y - yes / N - no >> ");
            String choice = String.valueOf(scan.nextLine().toUpperCase().charAt(0));

            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Hours worked: ");
            int hoursWorked = scan.nextInt();
            System.out.print("Value per hour: US$ ");
            double valuePerHour = scan.nextDouble();
            scan.nextLine();

            if (choice.equals("Y")) {
                System.out.print("Additional charge: ");
                double additionalCharge = scan.nextDouble();
                scan.nextLine();
                employeeList.add(new OutSourceEmployee(name, hoursWorked, valuePerHour, additionalCharge));

                System.out.println("\nEmployee registered. \n ");

            }else {
                employeeList.add(new Employee(name, hoursWorked, valuePerHour));
                System.out.println("\nEmployee registered. \n ");
            }
        }
        System.out.println("Payments:");
        for (Employee c : employeeList){
            System.out.println(c);
        }
        scan.close();
    }
}
