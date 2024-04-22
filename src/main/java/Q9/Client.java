package Q9;

// Client code
public class Client {
    public static void main(String[] args) {
        // Wrap the legacy system with the adapter
        IReservationService reservationService = new ReservationAdapter(new LegacyReservationSystem());

        // Use the reservation service to reserve a car
        reservationService.reserveCar(); // Internally calls legacyReservationSystem.bookVehicle()
    }
}
