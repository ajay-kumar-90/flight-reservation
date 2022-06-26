package com.ajaycodes.reservation.flight.repos;

import com.ajaycodes.reservation.flight.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    @Query(value = "FROM Flight fl WHERE fl.departureCity=:departureCity AND fl.arrivalCity=:arrivalCity AND fl.dateOfDeparture=:dateOfDeparture")
    List<Flight> findAll(@Param("departureCity") String from, @Param("arrivalCity") String to, @Param("dateOfDeparture") Date date);
}
