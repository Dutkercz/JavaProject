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
        for (Employee id : employeeList){
            if (id.getId() == 1092);
                Employee.increaseSalary(id);
        }

    }
}
