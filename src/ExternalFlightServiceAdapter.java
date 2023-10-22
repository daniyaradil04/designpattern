public class ExternalFlightServiceAdapter implements FlightBooking {
    private ExternalFlightService externalService;

    public ExternalFlightServiceAdapter(ExternalFlightService externalService) {
        this.externalService = externalService;
    }

    @Override
    public void bookFlight(String departure, String destination, String date) {
        externalService.bookExternalFlight(departure, destination, date);
    }

    @Override
    public double getCost() {
        // Cost calculation logic for external flights
        return 300.0;  // Base cost for external flight
    }

    @Override
    public String getDescription() {
        return "External Flight";  // Description for external flights
    }
}
