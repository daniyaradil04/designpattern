public class InternalFlightService implements FlightBooking {
    @Override
    public void bookFlight(String departure, String destination, String date) {
        System.out.println("Booking a flight from " + departure + " to " + destination + " on " + date);
    }
}
