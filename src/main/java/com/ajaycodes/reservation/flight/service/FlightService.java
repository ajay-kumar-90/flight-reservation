package com.ajaycodes.reservation.flight.service;

import com.ajaycodes.reservation.flight.entities.Flight;

import java.util.Date;
import java.util.List;

public interface FlightService {
    List<Flight> getAllFlights(String from, String to, Date dateOfDeparture);

    Flight getFlightById(Long flightId);
}
