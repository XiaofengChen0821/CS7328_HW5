package Q8;

// Client code
public class Client {
    public static void main(String[] args) {
        SharableCarFactory factory = new LuxuryBlackCarFactory();
        ISharableCar car = factory.createCar();
        car.displayFeatures();
        System.out.println("Fee: " + car.calculateFee());
    }
}
