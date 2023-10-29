public class ExternalFlightServiceAdapter implements FlightBooking {
    private ExternalFlightService externalService;

    public ExternalFlightServiceAdapter(ExternalFlightService externalService) {
        this.externalService = externalService;
    }

    public void bookFlight(String departure, String destination, String date) {
        externalService.bookExternalFlight(departure, destination, date);
    }
}
