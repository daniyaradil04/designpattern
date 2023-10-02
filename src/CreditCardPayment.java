public class CreditCardPayment implements Payment{
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using credit card ending with " + cardNumber.substring(cardNumber.length() - 4));
    }
}

