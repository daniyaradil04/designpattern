public class SeatDecorator implements FlightDecorator{
    private Flight flight;

    public SeatDecorator(Flight flight) {
        this.flight = flight;
    }

    @Override
    public double getCost() {
        return flight.getCost() + 500.0;
    }

    @Override
    public String getDescription() {
        return flight.getDescription() + " with optionally Seat";
    }
}
