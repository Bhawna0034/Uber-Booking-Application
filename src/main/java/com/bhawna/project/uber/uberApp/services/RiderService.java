package com.bhawna.project.uber.uberApp.services;

import com.bhawna.project.uber.uberApp.dto.DriverDto;
import com.bhawna.project.uber.uberApp.dto.RideDto;
import com.bhawna.project.uber.uberApp.dto.RideRequestDto;
import com.bhawna.project.uber.uberApp.dto.RiderDto;
import com.bhawna.project.uber.uberApp.entities.Rider;
import com.bhawna.project.uber.uberApp.entities.User;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Double rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();

    Rider createNewRider(User user);
}
