package AplicationThree.Aplication;

import AplicationThree.Entites.Department;
import AplicationThree.Entites.HourContracts;
import AplicationThree.Entites.Worker;
import AplicationThree.Enum.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import static java.time.LocalDate.parse;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sDF = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Nome do Departamento: ");
        Department departmentName = new Department(scan.nextLine());
        System.out.println();
        System.out.println("\t<<< Enter worker data >>>");

        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Level: Junior / Pleno / Sênior  >>");
        WorkerLevel workerLevel = WorkerLevel.valueOf(scan.nextLine().toUpperCase());
        System.out.print("Base Salary ");
        double baseSalary = scan.nextDouble();

        Worker worker = new Worker(name, workerLevel, baseSalary, departmentName );

        System.out.println(worker);

        System.out.println("How many contracts to this worker: ");
        int numberOfContracts = scan.nextInt();


        for (int i = 1; i <= numberOfContracts; i++) {
            scan.nextLine();
            System.out.println("Enter contract "+i+ "# data:");
            System.out.print("Date: DD/MM/YYYY ");
            Date data = sDF.parse(scan.next());
            System.out.print("Value per hour: ");
            double valuePerHour = scan.nextDouble();
            System.out.print("Number of hours: ");
            int numberOfHours = scan.nextInt();
            //Instancia um novo contrato, e associa esse contrato a lista de contratos do trabalhador.
            HourContracts contracAux = new HourContracts(data, valuePerHour, numberOfHours);
            worker.addContract(contracAux);
            System.out.println(worker);

        }
        System.out.println("Enter year and month to calculate income: (MM/YYYY) ");
        String yearAndMont = scan.next();
        System.out.println(yearAndMont);
        int month = Integer.parseInt(yearAndMont.substring(0,2));
        int year = Integer.parseInt(yearAndMont.substring(3));

        double totalSalary = worker.income(month, year);

        System.out.println("Worker: "+ worker.getName());
        System.out.println("Department: " + worker.getDepartment().getDepartamentName());
        System.out.printf("Income for " + yearAndMont + ": %.2f", totalSalary);

    }
}
