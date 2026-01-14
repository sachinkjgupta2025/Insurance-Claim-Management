package com.example.claims.model;

public class VehicleInsurance extends Insurance {
    @Override
    public void processClaim() {
        System.out.println("Processing Vehicle Insurance Claim");
    }
}
