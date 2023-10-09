public class MealDecorator implements FlightDecorator{
    private Flight flight;

    public MealDecorator(Flight flight) {
        this.flight = flight;
    }

    @Override
    public double getCost() {
        return flight.getCost() + 5000.0;
    }

    @Override
    public String getDescription() {
        return flight.getDescription() + " with Meal Option";
    }
}
