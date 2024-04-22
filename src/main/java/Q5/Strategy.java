package Q5;

// Strategy Interface
interface PricingStrategy {
    double calculateFare(RideDetails rideDetails);
}

// Concrete Strategies
class StandardPricing implements PricingStrategy {
    public double calculateFare(RideDetails rideDetails) {
        // implementation for standard pricing
        return rideDetails.baseFare + rideDetails.distance * 1.5;
    }
}

class SurgePricing implements PricingStrategy {
    public double calculateFare(RideDetails rideDetails) {
        // implementation for surge pricing
        return
                (rideDetails.baseFare + rideDetails.distance * 1.5)
                        * rideDetails.surgeMultiplier;
    }
}

class OffPeakPricing implements PricingStrategy {
    public double calculateFare(RideDetails rideDetails) {
        // implementation for off-peak pricing
        return
                (rideDetails.baseFare + rideDetails.distance * 1.5) * 0.9;
    }
}

// Context
class RideService {
    private PricingStrategy pricingStrategy;

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public double calculateFare(RideDetails details) {
        return pricingStrategy.calculateFare(details);
    }
}

// Supporting class for ride details
class RideDetails {
    double baseFare;
    double distance;
    double surgeMultiplier;

    public RideDetails(double baseFare, double distance,
                       double surgeMultiplier) {
        this.baseFare = baseFare;
        this.distance = distance;
        this.surgeMultiplier = surgeMultiplier;
    }
}


