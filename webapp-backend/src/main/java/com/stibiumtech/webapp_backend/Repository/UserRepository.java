package com.stibiumtech.webapp_backend.Repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stibiumtech.webapp_backend.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}