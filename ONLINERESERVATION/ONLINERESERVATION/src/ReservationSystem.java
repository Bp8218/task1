import java.util.ArrayList;
import java.util.List;

public class ReservationSystem {
    private List<Reservation> reservations;

    public ReservationSystem() {
        reservations = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public void showReservations() {
        if (reservations.isEmpty()) {
            System.out.println("No reservations made yet.");
        } else {
            for (Reservation res : reservations) {
                System.out.println(res);
            }
        }
    }
}

