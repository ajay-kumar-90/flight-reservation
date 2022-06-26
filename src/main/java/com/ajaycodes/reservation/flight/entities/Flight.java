package com.ajaycodes.reservation.flight.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import java.sql.Timestamp;
import java.util.Date;

import static javax.persistence.TemporalType.DATE;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Flight extends AbstractEntity {
    private String flightNumber;
    private String operatingAirline;
    private String departureCity;
    private String arrivalCity;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(DATE)
    private Date dateOfDeparture;
    private Timestamp estimatedDepartureTime;
}
