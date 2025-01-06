package Exercises.ApplicationEight.Application;

import Exercises.ApplicationEight.ContractService;
import Exercises.ApplicationEight.Entities.Contract;
import Exercises.ApplicationEight.Entities.Installments;
import Exercises.ApplicationEight.PayPalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter contract data.");
        System.out.println("====================");
        System.out.print("Contract number: ");
        int contractNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Contract start date: " );
        LocalDate date = LocalDate.parse(scanner.nextLine(), dateFormat);
        System.out.print("Contract value ");
        double contracValue = scanner.nextDouble();
        Contract contract = new Contract(contractNumber, date, contracValue);

        System.out.print("Enter installments number ");
        int installmentsNumber = scanner.nextInt();

        ContractService service = new ContractService(new PayPalService());

        service.processContract(contract, installmentsNumber);

        System.out.println("PARCELAS");

        for (Installments i : contract.getInstallments()){
            System.out.println(i);
        }


    }
}
