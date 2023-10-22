import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //economy no option
        Flight economyFlight = new EconomyFlight();
        System.out.println("Cost: tg" + economyFlight.getCost());
        System.out.println("Description: " + economyFlight.getDescription());

        System.out.println("--------------------------");

        //economy with seat
        Flight flightWithSeatSelection = new SeatDecorator(new EconomyFlight());
        System.out.println("Cost: tg" + flightWithSeatSelection.getCost());
        System.out.println("Description: " + flightWithSeatSelection.getDescription());

        System.out.println("--------------------------");

        //economy with meal
        Flight flightWithMealOption = new MealDecorator(new SeatDecorator(new EconomyFlight()));
        System.out.println("Cost: tg" + flightWithMealOption.getCost());
        System.out.println("Description: " + flightWithMealOption.getDescription());

        System.out.println("--------------------------");

        //economy with both
        Flight flightWithSeatAndMeal = new MealDecorator(new SeatDecorator(new EconomyFlight()));
        System.out.println("Cost: tg" + flightWithSeatAndMeal.getCost());
        System.out.println("Description: " + flightWithSeatAndMeal.getDescription());

        System.out.println("--------------------------");

        ExternalFlightService externalService = new ExternalFlightService();
        Flight externalFlight = new ExternalFlightServiceAdapter(externalService);

        System.out.println("Cost: $" + externalFlight.getCost());
        System.out.println("Description: " + externalFlight.getDescription());

        ExternalFlightService externalService = new ExternalFlightService();
        FlightBooking adapter = new ExternalFlightServiceAdapter(externalService);
        adapter.bookFlight("CityX", "CityY", "2023-11-01");
    }
}