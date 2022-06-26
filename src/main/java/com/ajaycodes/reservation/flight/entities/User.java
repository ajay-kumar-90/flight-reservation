package com.ajaycodes.reservation.flight.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User extends AbstractEntity {

    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String email;
    private String password;
}
