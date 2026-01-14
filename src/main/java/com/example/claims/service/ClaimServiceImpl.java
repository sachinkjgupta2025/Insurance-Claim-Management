package com.example.claims.service;

import com.example.claims.model.HealthInsurance;
import com.example.claims.model.VehicleInsurance;

public class ClaimServiceImpl implements ClaimService, BaseClaimService {
    @Override
    public void initiateClaim() {
        System.out.println("Initiating claim in ClaimServiceImpl");

        // Polymorphism example
        HealthInsurance hi = new HealthInsurance();
        hi.processClaim();

        BaseClaimService.notifyClaim(); // static method call (method hiding)
    }
}
