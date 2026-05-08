package com.stibiumtech.webapp_backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.stibiumtech.webapp_backend.Repository.UserRepository;
import com.stibiumtech.webapp_backend.model.User;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public String registerUser(User user) {

        if (user.getPassword_hash() == null) {
            throw new RuntimeException("Password cannot be null");
        }

        if (userRepository.findByEmail(user.getEmail()).isPresent()) {
            return "Email already exists";
        }

        user.setPassword_hash(encoder.encode(user.getPassword_hash()));
        userRepository.save(user);

        return "User saved";
    }
}
