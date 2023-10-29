public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------------");

        FlightBooking internalFlightService = new InternalFlightService();
        internalFlightService.bookFlight("CityA", "CityB", "2023-23-10");

        ExternalFlightService externalService = new ExternalFlightService();
        FlightBooking adapter = new ExternalFlightServiceAdapter(externalService);
        adapter.bookFlight("CityA", "CityB", "2023-23-10");

        FlightStatusObserver userObserver = new UserFlightStatusObserver();
        FlightStatusObserver userObserver1 = new UserFlightStatusObserver();
        FlightStatusObservable internalFlightServiceObservable = new InternalFlightService();
        internalFlightServiceObservable.addObserver(userObserver);
        internalFlightServiceObservable.addObserver(userObserver1);
        internalFlightServiceObservable.notifyObservers("City A");
    }
}
