package com.ajaycodes.reservation.flight.repos;

import com.ajaycodes.reservation.flight.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
