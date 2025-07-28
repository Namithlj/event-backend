package service;

import java.util.Optional;
import org.springframework.stereotype.Service;
import model.User;
import repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepo;

    public UserService(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    public User signup(User user) {
        return userRepo.save(user);
    }

    public boolean login(String email, String password) {
        Optional<User> existing = userRepo.findByEmail(email);
        if (existing.isPresent()) {
            User user = existing.get();
            return user.getPassword().equals(password); // Plain text match
        }
        return false;
    }
}
