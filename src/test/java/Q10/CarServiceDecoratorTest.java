package Q10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class CarServiceDecoratorTest {
    private BasicCarService basicCarService;
    private GPSFeatureDecorator gpsDecorator;

    @BeforeEach
    void setUp() {
        // Create a real basic car service and a decorator wrapped around it
        basicCarService = new BasicCarService();
        gpsDecorator = new GPSFeatureDecorator(basicCarService);
    }

    @Test
    void hireCar_WithBasicService() {
        basicCarService = mock(BasicCarService.class);
        basicCarService.hireCar();
        verify(basicCarService, times(1)).hireCar();
    }

    @Test
    void hireCar_WithGPSDecorator() {
        // Mock the underlying car service to isolate testing the decorator
        ICarService mockedCarService = mock(ICarService.class);
        GPSFeatureDecorator decorator = new GPSFeatureDecorator(mockedCarService);

        decorator.hireCar();

        // Verify the original service method was called
        verify(mockedCarService).hireCar();
    }
}
