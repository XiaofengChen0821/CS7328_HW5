package Q6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class CouponDistributionSystemTest {
    private CouponDistributionSystem system;
    private RiderObserver rider1;
    private RiderObserver rider2;

    @BeforeEach
    void setUp() {
        system = new CouponDistributionSystem();
        rider1 = mock(Rider.class);
        rider2 = mock(Rider.class);
    }

    @Test
    void testRegisterObserver() {
        system.registerObserver(rider1);
        system.setCouponCode("SPRING20");  // Triggers notification
        verify(rider1).update("SPRING20");
    }

    @Test
    void testNotifyObservers() {
        system.registerObserver(rider1);
        system.registerObserver(rider2);
        system.setCouponCode("SPRING20");
        verify(rider1).update("SPRING20");
        verify(rider2).update("SPRING20");
    }

    @Test
    void testRemoveObserver() {
        system.registerObserver(rider1);
        system.registerObserver(rider2);
        system.removeObserver(rider1);
        system.setCouponCode("SUMMER20");
        verify(rider1, never()).update("SUMMER20");
        verify(rider2).update("SUMMER20");
    }
}
