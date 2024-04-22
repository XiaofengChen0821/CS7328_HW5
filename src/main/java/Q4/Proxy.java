package Q4;

// Payment processing interface
interface PaymentProcessor {
    String processPayment(double amount);
}

// Real PayPal processor
class PayPalProcessor implements PaymentProcessor {
    public String processPayment(double amount) {
        // Directly interact with PayPal API
        return "Processed $" + amount + " through PayPal";
    }
}
// PayPal Proxy
class PayPalProxy implements PaymentProcessor {
    private PayPalProcessor realPayPalProcessor;

    public PayPalProxy() {
        this.realPayPalProcessor = new PayPalProcessor();
    }

    public String processPayment(double amount) {
        // Prepare data in PayPal-compatible format
        // Forward the call to the real PayPal processor
        return realPayPalProcessor.processPayment(amount);
    }
}


