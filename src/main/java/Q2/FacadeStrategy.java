package Q2;

// Strategy Interface
interface ServiceStrategyInterface {
    double calculateFee();
}

// Concrete Strategies
class CarPOOLStrategy implements ServiceStrategyInterface {
    public double calculateFee() {
        // Logic for CarPOOL fee calculation
        return 10.0; // Example fee
    }
}

class CarXStrategy implements ServiceStrategyInterface {
    public double calculateFee() {
        // Logic for CarX fee calculation
        return 20.0; // Example fee
    }
}

class CarBlackStrategy implements ServiceStrategyInterface {
    public double calculateFee() {
        // Logic for CarBlack fee calculation
        return 30.0; // Example fee
    }
}

// Facade class
class RideServiceFacade {
    public ServiceStrategyInterface selectService(String serviceType) {
        switch (serviceType) {
            case "carPOOL":
                return new CarPOOLStrategy();
            case "carX":
                return new CarXStrategy();
            case "carBlack":
                return new CarBlackStrategy();
            default:
                throw new IllegalArgumentException("Invalid service type");
        }
    }
}
