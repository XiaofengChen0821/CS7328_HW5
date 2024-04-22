package Q2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServiceStrategyInterfaceTest {

    @Test
    void testCarPOOLStrategy() {
        ServiceStrategyInterface carPool = new CarPOOLStrategy();
        assertEquals(10.0, carPool.calculateFee(), "CarPOOL fee should be 10.0");
    }

    @Test
    void testCarXStrategy() {
        ServiceStrategyInterface carX = new CarXStrategy();
        assertEquals(20.0, carX.calculateFee(), "CarX fee should be 20.0");
    }

    @Test
    void testCarBlackStrategy() {
        ServiceStrategyInterface carBlack = new CarBlackStrategy();
        assertEquals(30.0, carBlack.calculateFee(), "CarBlack fee should be 30.0");
    }
}
