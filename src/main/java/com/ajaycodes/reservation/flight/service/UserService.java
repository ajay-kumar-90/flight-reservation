package com.ajaycodes.reservation.flight.service;

import com.ajaycodes.reservation.flight.entities.User;

import java.util.Optional;

public interface UserService {

    User saveUser(User user);

    User findUserByEmail(String email);

}
