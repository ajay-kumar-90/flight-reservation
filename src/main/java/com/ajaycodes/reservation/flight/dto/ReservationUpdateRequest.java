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
public class ReservationUpdateRequest {
    private Long id;
    private boolean checkedIn;
    private int numberOfBags;
}
