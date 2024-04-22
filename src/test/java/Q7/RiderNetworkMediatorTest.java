package Q7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class RiderNetworkMediatorTest {
    private RiderNetworkMediator mediator;
    private Rider rider1;
    private Rider rider2;
    private Rider rider3;

    @BeforeEach
    void setUp() {
        mediator = new RiderNetworkMediator();
        rider1 = mock(Rider.class);
        rider2 = mock(Rider.class);
        rider3 = mock(Rider.class);

        mediator.addRider(rider1);
        mediator.addRider(rider2);
        mediator.addRider(rider3);
    }

    @Test
    void sendMessage_ShouldDeliverMessageToAllButSender() {
        mediator.sendMessage("Hello from Rider 1", rider1);

        verify(rider1, never()).receive(anyString());
        verify(rider2).receive("Hello from Rider 1");
        verify(rider3).receive("Hello from Rider 1");
    }

    @Test
    void broadcastMessage_ShouldDeliverMessageToAllIncludingSender() {
        mediator.broadcastMessage("Broadcast from Rider 1", rider1);

        verify(rider1).receive("Broadcast from Rider 1");
        verify(rider2).receive("Broadcast from Rider 1");
        verify(rider3).receive("Broadcast from Rider 1");
    }
}
