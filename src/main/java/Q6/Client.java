package Q6;

public class Client {
    public static void main(String[] args) {
        CouponDistributionSystem system = new CouponDistributionSystem();
        Rider rider1 = new Rider("John Doe");
        Rider rider2 = new Rider("Jane Smith");

        system.registerObserver(rider1);
        system.registerObserver(rider2);

        system.setCouponCode("SPRING20"); // Notify all registered riders
        system.removeObserver(rider1); // John Doe opts out
        system.setCouponCode("SUMMER20"); // Notify remaining riders
    }
}
