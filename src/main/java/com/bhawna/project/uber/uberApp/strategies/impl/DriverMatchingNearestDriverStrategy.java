package com.bhawna.project.uber.uberApp.strategies.impl;

import com.bhawna.project.uber.uberApp.entities.Driver;
import com.bhawna.project.uber.uberApp.entities.RideRequest;
import com.bhawna.project.uber.uberApp.repositories.DriverRepository;
import com.bhawna.project.uber.uberApp.strategies.DriverMatchingStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    private final DriverRepository driverRepository;

    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        driverRepository.findTenNearestDrivers(rideRequest.getPickupLocation());
        return List.of();
    }
}
