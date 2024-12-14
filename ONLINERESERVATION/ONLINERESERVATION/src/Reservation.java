import java.util.Date;

public class Reservation {
    private Customer customer;
    private Date reservationDate;
    private int numberOfSeats;

    public Reservation(Customer customer, Date reservationDate, int numberOfSeats) {
        this.customer = customer;
        this.reservationDate = reservationDate;
        this.numberOfSeats = numberOfSeats;
    }

    // Getters and Setters
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Reservation for " + customer.getName() + " on " + reservationDate + " for " + numberOfSeats + " seats.";
    }
}
