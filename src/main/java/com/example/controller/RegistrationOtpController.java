package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.RegistrationOtpService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api")
public class RegistrationOtpController {

    @Autowired
    RegistrationOtpService registrationOtpService;

    @PostMapping("/registration-otp")
    public ResponseEntity<String> otpSession(@RequestParam String mobile) {
        registrationOtpService.createAndSendOtp(mobile);
        return ResponseEntity.ok("otp generated successfully");
    }

}
