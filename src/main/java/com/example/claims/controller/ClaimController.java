package com.example.claims.controller;

import com.example.claims.service.ClaimService;
import com.example.claims.service.ClaimServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClaimController {

    private final ClaimService claimService = new ClaimServiceImpl();

    @GetMapping("/claim")
    public String claim() {
        claimService.initiateClaim();
        return "Claim Initiated! WITH GIT COMMIT";
    }
}
