package Q2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RideServiceFacadeTest {

    @Test
    void selectServiceCarPOOL() {
        RideServiceFacade facade = new RideServiceFacade();
        assertInstanceOf(CarPOOLStrategy.class, facade.selectService("carPOOL"), "Should return CarPOOLStrategy");
    }

    @Test
    void selectServiceCarX() {
        RideServiceFacade facade = new RideServiceFacade();
        assertInstanceOf(CarXStrategy.class, facade.selectService("carX"), "Should return CarXStrategy");
    }

    @Test
    void selectServiceCarBlack() {
        RideServiceFacade facade = new RideServiceFacade();
        assertInstanceOf(CarBlackStrategy.class, facade.selectService("carBlack"), "Should return CarBlackStrategy");
    }

    @Test
    void selectServiceInvalid() {
        RideServiceFacade facade = new RideServiceFacade();
        assertThrows(IllegalArgumentException.class, () -> facade.selectService("invalid"),
                "Should throw IllegalArgumentException for invalid service types");
    }
}
