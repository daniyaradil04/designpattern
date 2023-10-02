public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = PaymentProcessor.getInstance();

        // payment strategy
        Payment creditCardPayment = new CreditCardPayment("4400-4301-5170-0942");
        Payment paypalPayment = new PayPalPayment("adildaniyar@paypal.com");

        // use strategy through singleton
        paymentProcessor.processPayment(creditCardPayment, 550);
        paymentProcessor.processPayment(paypalPayment, 300);
    }
}