package controller;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
import model.Booking;
import service.BookingService;
import service.WorkerService;

@RestController
@RequestMapping("/api/bookings")
@CrossOrigin(origins = "http://localhost:4200")
public class BookingController {

    private final BookingService bookingService;
    private final WorkerService workerService;

    public BookingController(BookingService bookingService, WorkerService workerService) {
        this.bookingService = bookingService;
        this.workerService = workerService;
    }

    @GetMapping("/nearest")
    public Map<String, Object> getNearest(@RequestParam String pincode, @RequestParam String date) {
        boolean available = bookingService.isDateAvailable(date);

        Map<String, Object> response = new HashMap<>();
        if (!available) {
            response.put("message", "Date not available, showing nearest available data");
        }

        response.put("hotels", workerService.findByTypeAndPincode("hotel", pincode));
        response.put("functionHalls", workerService.findByTypeAndPincode("hall", pincode));
        response.put("catering", workerService.findByTypeAndPincode("catering", pincode));
        response.put("decoration", workerService.findByTypeAndPincode("decoration", pincode));
        response.put("photography", workerService.findByTypeAndPincode("photography", pincode));

        return response;
    }

    @PostMapping
    public Booking saveBooking(@RequestBody Booking booking) {
        return bookingService.saveBooking(booking);
    }
}
