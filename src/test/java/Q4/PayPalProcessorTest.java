package Q4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayPalProcessorTest {

    @Test
    void testProcessPayment() {
        PaymentProcessor processor = new PayPalProcessor();
        String result = processor.processPayment(100.0);
        assertEquals("Processed $100.0 through PayPal", result);
    }
}
