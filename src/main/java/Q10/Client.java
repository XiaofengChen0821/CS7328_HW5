package Q10;

// Client code
public class Client {
    public static void main(String[] args) {
        ICarService carService = new BasicCarService();
        ICarService carServiceWithGPS = new GPSFeatureDecorator(carService);

        // Basic car service without GPS
        carService.hireCar();

        // Enhanced car service with GPS feature
        carServiceWithGPS.hireCar(); // Outputs "Basic car hired." followed by "GPS added to the service."
    }
}
