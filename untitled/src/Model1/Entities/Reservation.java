package Model1.Entities;

import Model1.Exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        if (checkIn.after(checkOut)){
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }


    public Date getCheckOut() {
        return checkOut;
    }

    public long duration () {
        long difference = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut){

        Date dateNow = new Date();
        if (checkIn.before(dateNow) || checkOut.before(dateNow)) {
           throw new DomainException("Update date invalid. Dates to update must be futures.");
        }
        if (checkIn.after(checkOut)){
            throw new DomainException("Check-out must be after check-in");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "\nRoom: " + roomNumber +
                "\nCheck-in date: " + sdf.format(checkIn) +
                " Check-out date: "+ sdf.format(checkOut)+
                ", "+duration() +" nights";

    }
}
