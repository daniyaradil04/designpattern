public class EconomyFlight implements Flight {
    @Override
    public double getCost() {
        return 65000.0;
    }

    @Override
    public String getDescription() {
        return "Economy Class Flight";
    }
}
