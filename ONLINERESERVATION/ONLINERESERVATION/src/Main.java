import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReservationSystem reservationSystem = new ReservationSystem();
        
        // Define the date format you expect
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        while (true) {
            System.out.println("\n--- Online Reservation System ---");
            System.out.println("1. Add Reservation");
            System.out.println("2. View Reservations");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            if (choice == 1) {
                // Adding a reservation
                System.out.print("Enter your name: ");
                String name = scanner.nextLine();

                System.out.print("Enter your email: ");
                String email = scanner.nextLine();

                System.out.print("Enter your phone: ");
                String phone = scanner.nextLine();

                Customer customer = new Customer(name, email, phone);

                // Prompt for reservation date
                System.out.print("Enter reservation date (format: YYYY-MM-DD): ");
                String dateInput = scanner.nextLine();
                Date reservationDate = null;

                // Parse the date string using SimpleDateFormat
                try {
                    reservationDate = dateFormat.parse(dateInput);
                } catch (Exception e) {
                    System.out.println("Invalid date format. Please use YYYY-MM-DD.");
                    continue;
                }

                System.out.print("Enter number of seats: ");
                int seats = scanner.nextInt();

                Reservation reservation = new Reservation(customer, reservationDate, seats);
                reservationSystem.addReservation(reservation);
                System.out.println("Reservation added successfully!");

            } else if (choice == 2) {
                // Displaying all reservations
                reservationSystem.showReservations();

            } else if (choice == 3) {
                // Exit
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice! Try again.");
            }
        }

        scanner.close();
    }
}
