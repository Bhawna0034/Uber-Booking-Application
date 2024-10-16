package com.bhawna.project.uber.uberApp.controllers;

import com.bhawna.project.uber.uberApp.dto.DriverDto;
import com.bhawna.project.uber.uberApp.dto.OnboardDriverDto;
import com.bhawna.project.uber.uberApp.dto.SignupDto;
import com.bhawna.project.uber.uberApp.dto.UserDto;
import com.bhawna.project.uber.uberApp.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    ResponseEntity<UserDto> signUp(@RequestBody SignupDto signupDto){
        return new ResponseEntity<>(authService.signup(signupDto), HttpStatus.CREATED);
    }

    @PostMapping("/onboardNewDriver/{userId}")
    ResponseEntity<DriverDto> onboardNewDriver(@PathVariable Long userId,
                                               @RequestBody  OnboardDriverDto onboardDriverDto){
        return new ResponseEntity<>(authService.onboardNewDriver(userId,
                onboardDriverDto.getVehicleId()), HttpStatus.CREATED);
    }
}
