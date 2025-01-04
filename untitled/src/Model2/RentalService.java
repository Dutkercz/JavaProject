package Model2;

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

    }
}
