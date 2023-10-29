public interface FlightStatusObservable {
    void addObserver(FlightStatusObserver observer);
    void removeObserver(FlightStatusObserver observer);
    void notifyObservers(String message);
}
