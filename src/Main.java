public class Main {
    public static void main(String[] args) {

        //economy no option
        Flight internalEconomyFlight = new EconomyFlight();
        System.out.println("Cost: tg" + internalEconomyFlight.getCost());
        System.out.println("Description: " + internalEconomyFlight.getDescription());

        System.out.println("--------------------------");

        //economy with seat
        Flight internalFlightWithSeatSelection = new SeatDecorator(new EconomyFlight());
        System.out.println("Cost: tg" + internalFlightWithSeatSelection.getCost());
        System.out.println("Description: " + internalFlightWithSeatSelection.getDescription());

        System.out.println("--------------------------");

        //economy with meal
        Flight internalFlightWithMealOption = new MealDecorator(new SeatDecorator(new EconomyFlight()));
        System.out.println("Cost: tg" + internalFlightWithMealOption.getCost());
        System.out.println("Description: " + internalFlightWithMealOption.getDescription());

        System.out.println("--------------------------");

        //economy with both
        Flight internalFlightWithSeatAndMeal = new MealDecorator(new SeatDecorator(new EconomyFlight()));
        System.out.println("Cost: tg" + internalFlightWithSeatAndMeal.getCost());
        System.out.println("Description: " + internalFlightWithSeatAndMeal.getDescription());

        System.out.println("--------------------------");

        FlightBooking internalFlightService = new InternalFlightService();
        internalFlightService.bookFlight("CityA", "CityB", "2023-23-10");

        ExternalFlightService externalService = new ExternalFlightService();
        FlightBooking adapter = new ExternalFlightServiceAdapter(externalService);
        adapter.bookFlight("CityA", "CityB", "2023-23-10");
    }
}