package Q3;

public class Client {
    public static void main(String[] args) {
        CarSharingService serviceInIndia = new CarGoIndia();
        CarSharingService serviceInLondon = new CarEATSLondon();

        System.out.println("Service in India:");
        serviceInIndia.provideService();

        System.out.println("\nService in London:");
        serviceInLondon.provideService();
    }
}
