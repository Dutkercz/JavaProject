package Model2;

import java.time.LocalDateTime;

public class CarRental {


    private LocalDateTime start;
    private LocalDateTime finish;

    private Model2.Vehicle vehicle;
    private Model2.Invoice invoice;

    public CarRental() {
    }

    public CarRental(LocalDateTime start, LocalDateTime finish, Model2.Vehicle vehicle) {
        this.start = start;
        this.finish = finish;
        this.vehicle = vehicle;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Model2.Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Model2.Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Model2.Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Model2.Invoice invoice) {
        this.invoice = invoice;
    }
}
