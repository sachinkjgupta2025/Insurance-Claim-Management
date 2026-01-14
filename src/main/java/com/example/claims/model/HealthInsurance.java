package com.example.claims.model;

public class HealthInsurance extends Insurance {
    @Override
    public void processClaim() {
        System.out.println("Processing Health Insurance Claim");
    }
}
