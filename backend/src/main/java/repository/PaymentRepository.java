package repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import model.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}
