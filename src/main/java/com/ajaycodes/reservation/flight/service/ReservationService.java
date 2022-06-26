package com.ajaycodes.reservation.flight.service;

import com.ajaycodes.reservation.flight.dto.ReservationRequest;
import com.ajaycodes.reservation.flight.entities.Reservation;

public interface ReservationService {
    Reservation bookFlight(ReservationRequest request);

    Reservation getReservationById(Long id);

    Reservation updateReservation(Reservation reservation);
}
