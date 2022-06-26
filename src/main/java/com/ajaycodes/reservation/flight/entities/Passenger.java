package com.ajaycodes.reservation.flight.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Passenger extends AbstractEntity {
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String phone;
}
