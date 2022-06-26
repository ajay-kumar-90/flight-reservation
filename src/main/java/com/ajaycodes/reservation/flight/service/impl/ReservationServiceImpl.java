package com.ajaycodes.reservation.flight.service.impl;

import com.ajaycodes.reservation.flight.dto.ReservationRequest;
import com.ajaycodes.reservation.flight.entities.Flight;
import com.ajaycodes.reservation.flight.entities.Passenger;
import com.ajaycodes.reservation.flight.entities.Reservation;
import com.ajaycodes.reservation.flight.exceptions.FlightNotFoundException;
import com.ajaycodes.reservation.flight.exceptions.ReservationNotFoundException;
import com.ajaycodes.reservation.flight.repos.FlightRepository;
import com.ajaycodes.reservation.flight.repos.PassengerRepository;
import com.ajaycodes.reservation.flight.repos.ReservationRepository;
import com.ajaycodes.reservation.flight.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    private final PassengerRepository passengerRepository;
    private final FlightRepository flightRepository;
    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationServiceImpl(PassengerRepository passengerRepository, FlightRepository flightRepository, ReservationRepository reservationRepository) {
        this.passengerRepository = passengerRepository;
        this.flightRepository = flightRepository;
        this.reservationRepository = reservationRepository;
    }

    @Override
    public Reservation bookFlight(ReservationRequest request) {
        // Make payment

        Long flightId = request.getFlightId();
        Optional<Flight> flightOptional = flightRepository.findById(flightId);
        Flight flight = flightOptional.orElseThrow(() -> new FlightNotFoundException("Flight doesn't exist with " + flightId));
        Passenger passenger = Passenger.builder().firstName(request.getFirstName())
                                       .lastName(request.getLastName())
                                       .middleName(request.getMiddleName())
                                       .phone(request.getPhone())
                                       .email(request.getEmail())
                                       .build();
        Passenger savedPassenger = passengerRepository.save(passenger);
        Reservation reservation = Reservation.builder()
                                             .flight(flight)
                                             .passenger(passenger)
                                             .checkedIn(false)
                                             .build();

        return reservationRepository.save(reservation);

    }

    @Override
    public Reservation getReservationById(Long id) {
        Optional<Reservation> optionalReservation = reservationRepository.findById(id);
        return optionalReservation.orElseThrow(() -> new ReservationNotFoundException("Reservation doesn't exist with " + id));
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
