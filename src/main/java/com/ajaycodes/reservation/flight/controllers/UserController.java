package com.ajaycodes.reservation.flight.controllers;

import com.ajaycodes.reservation.flight.entities.User;
import com.ajaycodes.reservation.flight.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class UserController {

    private final UserService service;

    @Autowired
    public UserController(UserService service) {
        this.service = service;
    }

    @RequestMapping(value = "/showReg")
    public String showRegistrationPage() {
        return "login/registerUser";
    }

    @RequestMapping(value = "/showLogin")
    public String showLoginPage() {
        return "login/login";
    }

    @RequestMapping(value = "/registerUser", method = POST)
    public String registerUser(@ModelAttribute("user") User user) {
        // Service layer call to save entity
        service.saveUser(user);
        return "login/login";
    }


    @RequestMapping(value = "/login", method = POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, ModelMap modelMap) {
        // Service layer find by UserName/Email call to check if user Exists
        User user = service.findUserByEmail(email);
        // if condition to verify User Request Form password and DB password
        if (user != null && user.getPassword().equals(password)) {
            return "flight/findFlights";
        } else {
            // else an Error message And send back success message back to UI using model map
            String msg = "Invalid user name or password. Please try again";
            modelMap.addAttribute("msg", msg);
        }
        // At end return to Login page
        return "login/login";

    }


}

