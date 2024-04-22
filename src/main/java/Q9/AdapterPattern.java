package Q9;

// New system's reservation service interface
interface IReservationService {
    void reserveCar();
}

// Adapter class to use the legacy system
class ReservationAdapter implements IReservationService {
    private final LegacyReservationSystem legacyReservationSystem;

    public ReservationAdapter(LegacyReservationSystem legacySystem) {
        this.legacyReservationSystem = legacySystem;
    }

    @Override
    public void reserveCar() {
        // Translate the new system's reserve call into the legacy system's book call
        legacyReservationSystem.bookVehicle();
    }
}

// Legacy reservation system
class LegacyReservationSystem {
    public void bookVehicle() {
        System.out.println("Vehicle booked using the legacy system.");
    }
}
