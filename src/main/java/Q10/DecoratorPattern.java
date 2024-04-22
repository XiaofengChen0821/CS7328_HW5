package Q10;

// Base car service interface
interface ICarService {
    void hireCar();
}

// Concrete car service class
class BasicCarService implements ICarService {
    @Override
    public void hireCar() {
        System.out.println("Basic car hired.");
    }
}

// Decorator base class
abstract class CarServiceDecorator implements ICarService {
    protected ICarService decoratedCarService;

    public CarServiceDecorator(ICarService carService) {
        this.decoratedCarService = carService;
    }

    public void hireCar() {
        decoratedCarService.hireCar();
    }
}

// Concrete decorator adding new feature
class GPSFeatureDecorator extends CarServiceDecorator {
    public GPSFeatureDecorator(ICarService carService) {
        super(carService);
    }

    @Override
    public void hireCar() {
        super.hireCar();
        addGPS();
    }

    private void addGPS() {
        System.out.println("GPS added to the service.");
    }
}
