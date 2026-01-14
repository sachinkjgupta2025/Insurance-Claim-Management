package com.example.claims.utils;

public interface ClaimUtils {
    static void showStatic() {
        System.out.println("Static method from interface (method hiding)");
    }

    private static void hiddenHelper() {
        System.out.println("Private method in interface (Java 9+)");
    }
}
