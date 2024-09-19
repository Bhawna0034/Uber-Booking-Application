package com.bhawna.project.uber.uberApp.strategies.impl;

import com.bhawna.project.uber.uberApp.dto.RideRequestDto;
import com.bhawna.project.uber.uberApp.entities.RideRequest;
import com.bhawna.project.uber.uberApp.services.DistanceService;
import com.bhawna.project.uber.uberApp.strategies.RideFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RideFareDefaultFareCalculationStrategy implements RideFareCalculationStrategy {

    private final DistanceService distanceService;
    @Override
    public double calculateFare(RideRequest rideRequest) {
        double distance = distanceService.calculateDistance(rideRequest.getPickupLocation(),
                rideRequest.getDropOffLocation());

        return distance*RIDE_FARE_MULTIPLIER;
    }
}
