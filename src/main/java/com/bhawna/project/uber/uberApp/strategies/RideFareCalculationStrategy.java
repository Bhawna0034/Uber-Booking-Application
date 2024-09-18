package com.bhawna.project.uber.uberApp.strategies;

import com.bhawna.project.uber.uberApp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDto rideRequestDto);
}
