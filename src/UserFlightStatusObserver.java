public class UserFlightStatusObserver implements FlightStatusObserver{
    @Override
    public void update(String message) {
        System.out.println("Received Flight Status Update: " + message);
    }
}
