package com.ajaycodes.reservation.flight.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservationRequest {
    private Long flightId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String phone;
    private String email;
    private String nameOnCard;
    private String cardNumber;
    private String expirationDate;
    private String securityCode;

}
