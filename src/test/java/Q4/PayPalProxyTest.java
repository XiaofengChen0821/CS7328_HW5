package Q4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayPalProxyTest {

    @Test
    void testProcessPayment() {
        PaymentProcessor proxy = new PayPalProxy();
        String result = proxy.processPayment(50.0);
        assertEquals("Processed $50.0 through PayPal", result);
    }
}
