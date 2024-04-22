package Q3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CarSharingServiceTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testCarGoIndia() {
        CarSharingService service = new CarGoIndia();
        service.provideService();
        String output = outContent.toString();
        assertTrue(output.contains("Basic car ride service provided."));
        assertTrue(output.contains("CarGo service in India with hatchback cars."));
    }

    @Test
    void testCarEATSLondon() {
        CarSharingService service = new CarEATSLondon();
        service.provideService();
        String output = outContent.toString();
        assertTrue(output.contains("Basic car ride service provided."));
        assertTrue(output.contains("CarEATS service in London for restaurant meal deliveries."));
        assertTrue(output.contains("Delivering meals from participating restaurants."));
    }
}
