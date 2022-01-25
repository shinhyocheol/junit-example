package com.example.junit.service;

import com.example.junit.model.Parking;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Validated
@Service
public class ParkingService {


    @Validated(Parking.Apt.class)
    public void validatedAptParking() {

    }

    public void validatedNormalParking() {

    }
}
