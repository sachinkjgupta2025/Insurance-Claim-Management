package com.example.claims.service;

public interface BaseClaimService {
    default void logClaim() {
        System.out.println("Logging claim via default method");
    }

    static void notifyClaim() {
        System.out.println("Notifying about claim via static method");
    }
}
