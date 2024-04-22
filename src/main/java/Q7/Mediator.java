package Q7;

import java.util.ArrayList;
import java.util.List;

// Mediator Interface
interface SocialNetworkMediator {
    void sendMessage(String message, Rider sender);
    void broadcastMessage(String message, Rider sender);
}

// Concrete Mediator
class RiderNetworkMediator implements SocialNetworkMediator {
    private List<Rider> riders = new ArrayList<>();

    public void addRider(Rider rider) {
        riders.add(rider);
    }

    @Override
    public void sendMessage(String message, Rider sender) {
        for (Rider rider : riders) {
            // Prevent the sender from receiving their own message
            if (rider != sender) {
                rider.receive(message);
            }
        }
    }

    @Override
    public void broadcastMessage(String message, Rider sender) {
        for (Rider rider : riders) {
            rider.receive(message);
        }
    }
}

// Colleague
class Rider {
    private String name;
    private SocialNetworkMediator mediator;

    public Rider(String name, SocialNetworkMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void send(String message) {
        System.out.println(this.name + " sends message: " + message);
        mediator.sendMessage(message, this);
    }

    public void broadcast(String message) {
        System.out.println(this.name + " broadcasts message: " + message);
        mediator.broadcastMessage(message, this);
    }

    public void receive(String message) {
        System.out.println(this.name + " received message: " + message);
    }
}


