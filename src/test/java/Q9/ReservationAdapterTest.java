package Q9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class ReservationAdapterTest {
    private LegacyReservationSystem legacySystem;
    private ReservationAdapter adapter;

    @BeforeEach
    void setUp() {
        // Mock the legacy reservation system
        legacySystem = mock(LegacyReservationSystem.class);
        // Create an instance of the adapter using the mocked legacy system
        adapter = new ReservationAdapter(legacySystem);
    }

    @Test
    void testReserveCar() {
        // Call reserveCar on the adapter
        adapter.reserveCar();

        // Verify that bookVehicle is called on the legacy system
        verify(legacySystem).bookVehicle();
    }
}
