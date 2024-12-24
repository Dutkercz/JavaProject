package Exercicios.Ex06.Program;

import Exercicios.Ex06.Methods.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.println("How many employees will be registered: ");
        int registerAmount = scan.nextInt();
        int continueWhile = 0;
        while (continueWhile < registerAmount) {
            scan.nextLine();

            System.out.println("_________________________");
            System.out.println("Enter employee data:");

            System.out.print("Enter name: ");
            String name = scan.nextLine();
            System.out.print("Enter salary: ");
            double salary = scan.nextDouble();
            System.out.print("Enter ID: ");
            int id = scan.nextInt();

            continueWhile += 1;
            Employee employee = new Employee(name, salary, id);
            employeeList.add(employee);
        }
        System.out.println(employeeList);
        System.out.println("Enter Id of employee to increse salary");
        int idEmployee = scan.nextInt();

        for (int i = 0; i < employeeList.size(); i++) {

            if (employeeList.get(i).getId() == idEmployee){
                System.out.println("How much salary will be increased: ");
                double percentageIncrease = scan.nextDouble();
                employeeList.get(i).increaseSalary(percentageIncrease);

                System.out.println(employeeList.get(i));
            }else {
                System.out.println("Id not found.");
            }
        }
        System.out.println(employeeList);

    }
}
