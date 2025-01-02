package Model1.Application;

import Model1.Entities.Reservation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Hotel Room Reservation Program ***");

        System.out.print("Enter room number: ");
        int room = scanner.nextInt();
        System.out.print("Enter check-in date: ");
        Date checkIn = sdf.parse(scanner.next());
        System.out.print("Enter check-out date: ");
        Date checkOut = sdf.parse(scanner.next());

        if (checkIn.after(checkOut)){
            System.out.println("Invalid dates, check-out date must be after check-in date");
        }
        else {
            Reservation reservation = new Reservation(room, checkIn, checkOut);
            System.out.println("Reservation" + reservation);

            System.out.println();
            System.out.println("Enter data to update reservation");
            System.out.print("Enter check-in date: ");
            checkIn = sdf.parse(scanner.next());
            System.out.print("Enter check-out date: ");
            checkOut = sdf.parse(scanner.next());

            Date dateNow = new Date();
            if (checkIn.before(dateNow) || checkOut.before(dateNow) || checkOut.before(checkIn)) {
                System.out.println("Update date invalid. Dates to update must be futures or check-out must be after checki-in ");
            }else {
                reservation.upadateDates(checkIn, checkOut);
                System.out.println("Reservation update: ");
                System.out.println(reservation);
            }
        }

    }
}
