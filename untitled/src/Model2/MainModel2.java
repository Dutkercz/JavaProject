package Model2;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class MainModel2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy-HH:mm");

        System.out.println("Enter rental data");
        System.out.print("Car model: ");
        Vehicle carModel = new Vehicle(scanner.nextLine());
        System.out.print("Start rental date: DD/MM/YYYY HH:MM : ");
        LocalDateTime dateStart = LocalDateTime.parse(scanner.nextLine().replace(" ", "/"), dateFormat);
        System.out.print("End rental date: DD/MM/YYYY HH:MM : ");
        LocalDateTime dateEnd = LocalDateTime.parse(scanner.nextLine().replace(" ", "/"), dateFormat);

        CarRental carRental = new CarRental(dateStart, dateEnd, carModel);

        System.out.print("Price per hour: ");
        double pricePerHour = scanner.nextDouble();
        System.out.print("Price per day: ");
        double pricePerDay = scanner.nextDouble();

        RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrasilTaxService());

        rentalService.processInvoice(carRental);
    }
}
