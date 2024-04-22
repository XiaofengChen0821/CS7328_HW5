package Q4;

public class Client {
    private PaymentProcessor paymentProcessor;

    public Client(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    public void makePayment(double amount) {
        String result = paymentProcessor.processPayment(amount);
        System.out.println(result);
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PayPalProxy();
        Client client = new Client(processor);
        client.makePayment(100.0);
    }
}