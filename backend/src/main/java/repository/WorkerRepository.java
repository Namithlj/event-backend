package repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import model.Worker;

public interface WorkerRepository extends MongoRepository<Worker, String> {
    // Use location instead of pincode
    List<Worker> findByServiceTypeAndLocation(String serviceType, String location);

    List<Worker> findByServiceTypeContainingIgnoreCaseOrLocationContainingIgnoreCaseOrNameContainingIgnoreCase(
            String serviceType, String location, String name);
}
