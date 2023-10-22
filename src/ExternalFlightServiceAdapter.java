public class ExternalFlightServiceAdapter implements Flight {
    private ExternalFlightService externalService;

    public ExternalFlightServiceAdapter(ExternalFlightService externalService) {
        this.externalService = externalService;
    }

    @Override
    public double getCost() {
        // Cost calculation logic for external flights
        return 75000.0;  // Base cost for external flight
    }

    @Override
    public String getDescription() {
        return "External economy flight";  // Description for external flights
    }
}
