package Q5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PricingStrategyTest {
    private RideDetails rideDetails;

    @BeforeEach
    void setUp() {
        rideDetails = new RideDetails(10.0, 20.0, 2.0);  // baseFare, distance, surgeMultiplier
    }

    @Test
    void testStandardPricing() {
        PricingStrategy standard = new StandardPricing();
        double fare = standard.calculateFare(rideDetails);
        assertEquals(40.0, fare, "Standard pricing calculation should match.");
    }

    @Test
    void testSurgePricing() {
        PricingStrategy surge = new SurgePricing();
        double fare = surge.calculateFare(rideDetails);
        assertEquals(80.0, fare, "Surge pricing calculation should match.");
    }

    @Test
    void testOffPeakPricing() {
        PricingStrategy offPeak = new OffPeakPricing();
        double fare = offPeak.calculateFare(rideDetails);
        assertEquals(36.0, fare, "Off-peak pricing calculation should match.");
    }
}
