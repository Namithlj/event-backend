package service;

import java.util.List;
import org.springframework.stereotype.Service;
import model.Worker;
import repository.WorkerRepository;

@Service
public class WorkerService {
    private final WorkerRepository workerRepo;

    public WorkerService(WorkerRepository workerRepo) {
        this.workerRepo = workerRepo;
    }

    public Worker registerWorker(Worker worker) {
        return workerRepo.save(worker);
    }

    public List<Worker> getAllWorkers() {
        return workerRepo.findAll();
    }

    // Using location instead of pincode
    public List<Worker> findByTypeAndPincode(String serviceType, String pincode) {
        return workerRepo.findByServiceTypeAndLocation(serviceType, pincode);
    }

    public List<Worker> searchWorkers(String keyword) {
        return workerRepo
                .findByServiceTypeContainingIgnoreCaseOrLocationContainingIgnoreCaseOrNameContainingIgnoreCase(
                        keyword, keyword, keyword);
    }
}
