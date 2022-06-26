package com.ajaycodes.reservation.flight.controllers;

import com.ajaycodes.reservation.flight.dto.ReservationUpdateRequest;
import com.ajaycodes.reservation.flight.entities.Reservation;
import com.ajaycodes.reservation.flight.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/v1/flightReservations")
public class ReservationRESTController {

    private final ReservationService reservationService;

    @Autowired
    public ReservationRESTController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping(value = "{id}")
    public Reservation findReservation(@PathVariable("id") Long id) {
        // Service call to find one entity
        return reservationService.getReservationById(id);
    }

    @PutMapping
    public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
        // Service call to Fetch entity to be updated
        Reservation reservation = reservationService.getReservationById(request.getId());
        reservation.setNumberOfBags(request.getNumberOfBags());
        reservation.setCheckedIn(request.isCheckedIn());

        // Service call to update an Entity
        return reservationService.updateReservation(reservation);
    }
}
