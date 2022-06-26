package com.ajaycodes.reservation.flight.service.impl;

import com.ajaycodes.reservation.flight.entities.User;
import com.ajaycodes.reservation.flight.exceptions.UserNotFoundException;
import com.ajaycodes.reservation.flight.repos.UserRepository;
import com.ajaycodes.reservation.flight.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repository;

    @Autowired
    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }

    @Override
    public User findUserByEmail(String email) {
        Optional<User> userOptional = repository.findByEmail(email);
        return userOptional.orElseThrow(() -> new UserNotFoundException("User doesn't exist with " + email));
    }
}
