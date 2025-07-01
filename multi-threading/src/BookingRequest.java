import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BookingRequest implements Runnable {

    String bookingRequestName;

    BookingRequest(String bookingRequestName) {
        this.bookingRequestName = bookingRequestName;
    }

    void bookingReceived() {
        System.out.println(bookingRequestName + " : Booking Received");
    }

    void paymentProcessed() {
        System.out.println(bookingRequestName + " : Payment Processed");
    }

    void ticketConfirmed() {
        System.out.println(bookingRequestName + " : Ticket Confirmed");
    }

    @Override
    public void run() {
        bookingReceived();
        paymentProcessed();
        ticketConfirmed();
    }

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        threadPool.execute(new BookingRequest("Request 1"));
        threadPool.execute(new BookingRequest("Request 2"));
        threadPool.execute(new BookingRequest("Request 3"));
        threadPool.execute(new BookingRequest("Request 4"));
        threadPool.execute(new BookingRequest("Request 5"));

        threadPool.shutdown();
    }
}
