package dev.sandeep.Splitwise_JUL24.service;

import dev.sandeep.Splitwise_JUL24.dto.UserSignUpDTO;
import dev.sandeep.Splitwise_JUL24.exception.UserNotFoundException;
import dev.sandeep.Splitwise_JUL24.model.User;
import dev.sandeep.Splitwise_JUL24.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Integer id) {
        return userRepository.findById(id).orElseThrow(
                () -> new UserNotFoundException("User with id " + id + " not found")
        );
    }
}
