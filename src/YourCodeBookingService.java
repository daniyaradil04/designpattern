public class YourCodeBookingService implements FlightBooking {
    @Override
    public void bookFlight(String departure, String destination, String date) {
        // Your code to book a flight
        System.out.println("Booking a flight from " + departure + " to " + destination + " on " + date);
    }
}
