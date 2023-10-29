import java.util.ArrayList;
import java.util.List;

public class InternalFlightService implements FlightBooking, FlightStatusObservable {
    private List<FlightStatusObserver> observers = new ArrayList<>();

    @Override
    public void bookFlight(String departure, String destination, String date) {
        System.out.println("Booking a flight from " + departure + " to " + destination + " on " + date);
        notifyObservers("Flight from " + departure + " to " + destination + " on " + date + " is booked.");
    }
    @Override
    public void addObserver(FlightStatusObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(FlightStatusObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (FlightStatusObserver observer : observers) {
            observer.update(message);
        }
    }
}
