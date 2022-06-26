package com.ajaycodes.reservation.flight.service.impl;

import com.ajaycodes.reservation.flight.entities.Flight;
import com.ajaycodes.reservation.flight.exceptions.FlightNotFoundException;
import com.ajaycodes.reservation.flight.repos.FlightRepository;
import com.ajaycodes.reservation.flight.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class FlightServiceImpl implements FlightService {

    private final FlightRepository repository;

    @Autowired
    public FlightServiceImpl(FlightRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Flight> getAllFlights(String to, String from, Date dateOfDeparture) {
        return repository.findAll(to, from, dateOfDeparture);
    }

    @Override
    public Flight getFlightById(Long flightId) {
        Optional<Flight> flightOptional = repository.findById(flightId);
        return flightOptional.orElseThrow(() -> new FlightNotFoundException("Flight doesn't exist with " + flightId));

    }
}
