package com.bhawna.project.uber.uberApp.strategies;


import com.bhawna.project.uber.uberApp.entities.Driver;
import com.bhawna.project.uber.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
