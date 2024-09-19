package com.bhawna.project.uber.uberApp.dto;

import com.bhawna.project.uber.uberApp.entities.Rider;
import com.bhawna.project.uber.uberApp.entities.enums.PaymentMethod;
import com.bhawna.project.uber.uberApp.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDto {

    private Long id;

    private PointDto pickupLocation;

    private PointDto dropOffLocation;

    private PaymentMethod paymentMethod;

    private LocalDateTime requestedTime;

    private Rider rider;


    private RideRequestStatus rideRequestStatus;

}
