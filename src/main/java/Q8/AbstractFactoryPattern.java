package Q8;

// Common interface for all types of sharable cars
interface ISharableCar {
    void displayFeatures();
    double calculateFee();
}

// Concrete car classes
class NormalCar implements ISharableCar {
    public void displayFeatures() {
        System.out.println("Features of Normal Car");
    }
    public double calculateFee() {
        return 1.0; // Basic fee calculation
    }
}

class LuxuryBlackCar implements ISharableCar {
    public void displayFeatures() {
        System.out.println("Features of Luxury Black Car");
    }
    public double calculateFee() {
        return 2.5; // Luxury fee calculation
    }
}

class SUV implements ISharableCar {
    public void displayFeatures() {
        System.out.println("Features of SUV");
    }
    public double calculateFee() {
        return 2.0; // SUV fee calculation
    }
}

class WheelchairAccessible implements ISharableCar {
    public void displayFeatures() {
        System.out.println("Features of Wheelchair Accessible Transport");
    }
    public double calculateFee() {
        return 1.5; // Accessible transport fee calculation
    }
}

// Abstract factory for creating sharable cars
abstract class SharableCarFactory {
    abstract ISharableCar createCar();
}

// Concrete factory classes
class NormalCarFactory extends SharableCarFactory {
    ISharableCar createCar() {
        return new NormalCar();
    }
}

class LuxuryBlackCarFactory extends SharableCarFactory {
    ISharableCar createCar() {
        return new LuxuryBlackCar();
    }
}

class SUVFactory extends SharableCarFactory {
    ISharableCar createCar() {
        return new SUV();
    }
}

class WheelchairAccessibleFactory extends SharableCarFactory {
    ISharableCar createCar() {
        return new WheelchairAccessible();
    }
}

