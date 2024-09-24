package com.bhawna.project.uber.uberApp.services;

import com.bhawna.project.uber.uberApp.dto.DriverDto;
import com.bhawna.project.uber.uberApp.dto.RideDto;
import com.bhawna.project.uber.uberApp.dto.RiderDto;
import com.bhawna.project.uber.uberApp.entities.Driver;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideRequestId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId, String otp);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId, Double rating);

    DriverDto getMyProfile();

    List<RideDto> getAllMyRides();

    Driver getCurrentDriver();
}
