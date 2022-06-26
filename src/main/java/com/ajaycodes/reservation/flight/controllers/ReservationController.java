package com.ajaycodes.reservation.flight.controllers;

import com.ajaycodes.reservation.flight.dto.ReservationRequest;
import com.ajaycodes.reservation.flight.entities.Flight;
import com.ajaycodes.reservation.flight.entities.Reservation;
import com.ajaycodes.reservation.flight.service.FlightService;
import com.ajaycodes.reservation.flight.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.POST;


@Controller
public class ReservationController {

    private final FlightService flightService;
    private final ReservationService reservationService;

    @Autowired
    public ReservationController(FlightService flightService, ReservationService reservationService) {
        this.flightService = flightService;
        this.reservationService = reservationService;
    }


    @RequestMapping(value = "/showReservation")
    public String displayReservation(@RequestParam(value = "flightId") Long flightId, ModelMap modelMap) {
        Flight flight = flightService.getFlightById(flightId);
        modelMap.addAttribute("flight", flight);
        return "reservation/reservation";
    }


    @RequestMapping(value = "/saveReservation", method = POST)
    public String completeReservation(ReservationRequest request, ModelMap modelMap) {
        // Service layer call
        Reservation reservation = reservationService.bookFlight(request);
        String msg = "Reservation confirmed with Flight Id "+reservation.getId();
        modelMap.addAttribute("msg", msg);
        //Create a Success message And send back success message back to UI using model map
        return "reservation/reservationConfirmation";
    }
}
