package controller;

import model.Booking;
import model.Payment;
import repository.BookingRepository;
import service.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/payments")
@CrossOrigin(origins = "*")
public class PaymentController {
    private final PaymentService paymentService;
    private final BookingRepository bookingRepo;

    public PaymentController(PaymentService paymentService, BookingRepository bookingRepo) {
        this.paymentService = paymentService;
        this.bookingRepo = bookingRepo;
    }

    @PostMapping("/pay")
    public Payment processPayment(@RequestBody Payment payment) {
        Optional<Booking> booking = bookingRepo.findById(payment.getBookingId());
        if (booking.isEmpty()) throw new RuntimeException("Invalid Booking ID!");

        payment.setAmount(booking.get().getTotalPrice());
        return paymentService.savePayment(payment);
    }

    @PostMapping("/create-order")
    public Map<String, Object> createOrder(@RequestBody Map<String, Object> request) throws Exception {
        double amount = Double.parseDouble(request.get("amount").toString());
        return paymentService.createOrder(amount);
    }
}
