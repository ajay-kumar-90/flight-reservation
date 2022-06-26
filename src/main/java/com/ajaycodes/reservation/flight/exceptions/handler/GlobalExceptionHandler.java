package com.ajaycodes.reservation.flight.exceptions.handler;

import com.ajaycodes.reservation.flight.exceptions.UserNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.support.RequestContextUtils;
import org.springframework.web.servlet.view.RedirectView;


import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public RedirectView handleUserNotFoundException(UserNotFoundException ex, HttpServletRequest request) {
        // Create Redirect View object with /error page jsp
        RedirectView rw = new RedirectView("error");
        // Get output flash map from RequestContextUtils by passing request
        FlashMap outputFlashMap = RequestContextUtils.getOutputFlashMap(request);
        // put exception message in output flash map
            outputFlashMap.put("exceptionMsg", ex.getMessage());

        // return redirect view
        return rw;
    }

}
