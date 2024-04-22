package Q7;

public class Client {
    public static void main(String[] args) {
        RiderNetworkMediator mediator = new RiderNetworkMediator();
        Rider rider1 = new Rider("John", mediator);
        Rider rider2 = new Rider("Jane", mediator);
        Rider rider3 = new Rider("Alice", mediator);

        mediator.addRider(rider1);
        mediator.addRider(rider2);
        mediator.addRider(rider3);

        rider1.send("Hi there!"); // John sends a message to Jane and Alice
        rider3.broadcast("Good morning, everyone!");
        // Alice broadcasts a message to John, Jane, and anyone else listening
    }
}
