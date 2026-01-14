package com.example.claims.service;

@FunctionalInterface
public interface ClaimService {
    void initiateClaim();
    private void helperMethod() {
        System.out.println("Helper Method Inside Interface (Java 9+)");
    }
}
