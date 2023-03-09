package prog2.exercise4.flight.booking.system;

/**
 * Hello world!
 *
 */

import java.time.LocalDate;
import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dear passenger please input the following messages");
        System.out.println("Please enter Your FullName :");
        String passengerFullName = scanner.nextLine();
        System.out.println("Please enter The time you depart (in the form yyyy-mm-dd) :");
        String departString = scanner.nextLine();
        LocalDate depart = LocalDate.parse(departString);
        System.out.println("Please enter The time you return (in the form yyyy-mm-dd) :");
        String returnString = scanner.nextLine();
        LocalDate returnDate = LocalDate.parse(returnString);
        System.out.println("Please enter ChildrenPassengers:");
        int childrenPassengers = scanner.nextInt();
        System.out.println("Please enter AdultPassengers: ");
        int adultPassengers = scanner.nextInt();
        FlightBooking flightBooking = new FlightBooking(passengerFullName,depart,returnDate,childrenPassengers,adultPassengers);
        scanner.nextLine();
        
        System.out.println("Please choice the BookingClass(1.First;2.Business;3.Economy) NUMBER in STRING form:");
        String bookingClass =scanner.nextLine();
        flightBooking.setBookingClass(bookingClass);
        System.out.println("Please choice the TripType(1.One way;2.Return) NUMBER in STRING form:");
        String tripType =scanner.nextLine();
        flightBooking.setTripType(tripType);
        System.out.println("Please choice the TripSource( 1.Nanjing, 2.Beijing, 3.Oulu, 4.Helsinki) NUMBER in STRING form:");
        String tripSource =scanner.nextLine();
        flightBooking.setTripSource(tripSource);
        System.out.println("Please choice the TripDestination( 1.Nanjing, 2.Beijing, 3.Oulu, 4.Helsinki Not be the same as the TripSource) NUMBER in STRING form:(Number of tripSource,Number of tripDestination)");
        String tripDestination =scanner.nextLine();
        flightBooking.setTripDestination(tripSource,tripDestination);
        System.out.println("This is ticketNumber"+flightBooking.getTicketNumber());

        System.out.println(flightBooking);

    }
}

