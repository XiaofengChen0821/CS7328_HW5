package Q5;

public class Client {
    public static void main(String[] args) {
        RideDetails rideDetails = new RideDetails(10, 2.0, 1.2);
        // baseFare, distance, surgeMultiplier
        RideService rideService = new RideService();

        // Using standard pricing
        rideService.setPricingStrategy(new StandardPricing());
        System.out.println("Standard Pricing: " +
                rideService.calculateFare(rideDetails));

        // Switch to surge pricing
        rideService.setPricingStrategy(new SurgePricing());
        System.out.println("Surge Pricing: " +
                rideService.calculateFare(rideDetails));

        // Switch to off-peak pricing
        rideService.setPricingStrategy(new OffPeakPricing());
        System.out.println("Off-Peak Pricing: " +
                rideService.calculateFare(rideDetails));
    }
}
