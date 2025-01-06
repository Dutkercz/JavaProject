package Model2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class MainModel2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        Model2.Vehicle carModel = new Model2.Vehicle(scanner.nextLine());
        System.out.print("Start rental date: DD/MM/YYYY HH:MM : ");
        LocalDateTime dateStart = LocalDateTime.parse(scanner.nextLine(), dateFormat);
        System.out.print("End rental date: DD/MM/YYYY HH:MM : ");
        LocalDateTime dateEnd = LocalDateTime.parse(scanner.nextLine(), dateFormat);

        Model2.CarRental carRental = new Model2.CarRental(dateStart, dateEnd, carModel);

        System.out.print("Price per hour: ");
        double pricePerHour = scanner.nextDouble();
        System.out.print("Price per day: ");
        double pricePerDay = scanner.nextDouble();

        Model2.RentalService rentalService = new Model2.RentalService(pricePerDay, pricePerHour, new Model2.BrasilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println("Invoice:");
        System.out.println("Basic payment: U$ " + String.format("%.2f", carRental.getInvoice().getBasicPayment()));
        System.out.println("Tax: U$ " + String.format("%.2f", carRental.getInvoice().getTax()));
        System.out.println("Total payment: U$ " + String.format("%.2f", carRental.getInvoice().getTotalPayment()));
    }
}
