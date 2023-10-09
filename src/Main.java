public class Main {
    public static void main(String[] args) {
        Flight economyFlight = new EconomyFlight();
        System.out.println("Cost: tg" + economyFlight.getCost());
        System.out.println("Description: " + economyFlight.getDescription());

        System.out.println("--------------------------");

        // Book an economy flight with seat selection
        Flight flightWithSeatSelection = new SeatDecorator(new EconomyFlight());
        System.out.println("Cost: tg" + flightWithSeatSelection.getCost());
        System.out.println("Description: " + flightWithSeatSelection.getDescription());

        System.out.println("--------------------------");

        // Book an economy flight with meal option
        Flight flightWithMealOption = new MealDecorator(new EconomyFlight());
        System.out.println("Cost: tg" + flightWithMealOption.getCost());
        System.out.println("Description: " + flightWithMealOption.getDescription());

        System.out.println("--------------------------");

        // Book an economy flight with both seat selection and meal option
        Flight flightWithSeatAndMeal = new MealDecorator(new SeatDecorator(new EconomyFlight()));
        System.out.println("Cost: tg" + flightWithSeatAndMeal.getCost());
        System.out.println("Description: " + flightWithSeatAndMeal.getDescription());
    }
}