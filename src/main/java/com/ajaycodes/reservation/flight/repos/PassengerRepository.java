package com.ajaycodes.reservation.flight.repos;

import com.ajaycodes.reservation.flight.entities.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {
}
