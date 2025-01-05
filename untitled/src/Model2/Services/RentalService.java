package Model2;

import java.time.Duration;

public class RentalService {

    private Double pricePerDay;
    private Double pricePerHour;

    private BrasilTaxService taxService;

    public RentalService(Double pricePerDay, Double pricePerHour, BrasilTaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60;
        hours = Math.ceil(hours);

        double basicPayment;
        if (hours <= 12){
            basicPayment = hours * pricePerHour;
        }else {
            basicPayment = Math.ceil( hours / 24) * pricePerDay;
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));

    }
}
