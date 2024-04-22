package Q3;

abstract class CarSharingService {
    // Template method
    public final void provideService() {
        basicService();
        additionalService();
        if (isMealDeliveryAvailable()) {
            mealDelivery();
        }
    }

    // Standard service method
    private void basicService() {
        System.out.println("Basic car ride service provided.");
    }

    // Abstract method to be implemented by subclasses
    protected abstract void additionalService();

    // Hook for meal delivery
    protected boolean isMealDeliveryAvailable() {
        return false; // Default implementation without meal delivery
    }

    // Optional method
    protected void mealDelivery() {
        System.out.println("Meal delivery service is not available.");
    }
}


class CarGoIndia extends CarSharingService {
    @Override
    protected void additionalService() {
        System.out.println("CarGo service in India with hatchback cars.");
    }
}

class CarEATSLondon extends CarSharingService {
    @Override
    protected void additionalService() {
        System.out.println("CarEATS service in London for restaurant meal deliveries.");
    }

    @Override
    protected boolean isMealDeliveryAvailable() {
        return true;
    }

    @Override
    protected void mealDelivery() {
        System.out.println("Delivering meals from participating restaurants.");
    }
}
