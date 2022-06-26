package com.ajaycodes.reservation.flight.controllers;

import com.ajaycodes.reservation.flight.entities.Flight;
import com.ajaycodes.reservation.flight.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
public class FlightController {

    private final FlightService service;

    @Autowired
    public FlightController(FlightService service) {
        this.service = service;
    }

    @RequestMapping(value = "findFlights")
    public String showAllFlights(@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate, ModelMap modelMap) {
        // Service layer call to get all entities
        List<Flight> flights = service.getAllFlights(from,to,departureDate);
        //Send back all Entities to UI using model map
        modelMap.addAttribute("flights", flights);
        return "flight/displayFlights";
    }
}
