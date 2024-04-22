package Q8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SharableCarFactoryTest {

    @Test
    void testNormalCarFactory() {
        SharableCarFactory factory = new NormalCarFactory();
        ISharableCar car = factory.createCar();
        assertTrue(car instanceof NormalCar);
        assertEquals(1.0, car.calculateFee(), "Fee should be 1.0 for Normal Car");
    }

    @Test
    void testLuxuryBlackCarFactory() {
        SharableCarFactory factory = new LuxuryBlackCarFactory();
        ISharableCar car = factory.createCar();
        assertTrue(car instanceof LuxuryBlackCar);
        assertEquals(2.5, car.calculateFee(), "Fee should be 2.5 for Luxury Black Car");
    }

    @Test
    void testSUVFactory() {
        SharableCarFactory factory = new SUVFactory();
        ISharableCar car = factory.createCar();
        assertTrue(car instanceof SUV);
        assertEquals(2.0, car.calculateFee(), "Fee should be 2.0 for SUV");
    }

    @Test
    void testWheelchairAccessibleFactory() {
        SharableCarFactory factory = new WheelchairAccessibleFactory();
        ISharableCar car = factory.createCar();
        assertTrue(car instanceof WheelchairAccessible);
        assertEquals(1.5, car.calculateFee(), "Fee should be 1.5 for Wheelchair Accessible");
    }
}
