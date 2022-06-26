package com.ajaycodes.reservation.flight.repos;

import com.ajaycodes.reservation.flight.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
