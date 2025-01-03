package Model1.Application;

import Model1.Entities.Reservation;
import Model1.Exceptions.DomainException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Hotel Room Reservation Program ***");
        try {
            System.out.print("Enter room number: ");
            int room = scanner.nextInt();
            System.out.print("Enter check-in date: ");
            Date checkIn = sdf.parse(scanner.next());
            System.out.print("Enter check-out date: ");
            Date checkOut = sdf.parse(scanner.next());

            Reservation reserve = new Reservation(room, checkIn, checkOut);

            System.out.println("Reservation data: " + reserve);


            System.out.println();
            System.out.println("Enter data to update reservation");
            System.out.print("Enter check-in date: ");
            checkIn = sdf.parse(scanner.next());
            System.out.print("Enter check-out date: ");
            checkOut = sdf.parse(scanner.next());

            reserve.updateDates(checkIn, checkOut);

        }
        catch (InputMismatchException e ){
            System.out.println("Error! invalid characters");
        }
        catch (ParseException e){
            System.out.println("Error! Invalid date format.");
        }
        catch (DomainException e){
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }
    }
}
