package service;

import model.Booking;
import repository.BookingRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingService {
    private final BookingRepository bookingRepo;

    public BookingService(BookingRepository bookingRepo) {
        this.bookingRepo = bookingRepo;
    }

    public Booking saveBooking(Booking booking) {
        return bookingRepo.save(booking);
    }

    public boolean isDateAvailable(String eventDate) {
        List<Booking> bookings = bookingRepo.findByEventDate(eventDate);
        return bookings.isEmpty();
    }
}
