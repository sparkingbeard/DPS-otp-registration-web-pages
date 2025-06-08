package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.dto.OtpResponseDto;
import com.example.service.OtpSessionService;

@RestController
@RequestMapping("/api")
public class OtpSessionController {
    @Autowired
    OtpSessionService otpSessionService ;

    @PostMapping("/otp-session")
    public ResponseEntity<OtpResponseDto> otpSession(@RequestParam String mobile) {
       String otp = otpSessionService.createAndSendOtp(mobile);
       OtpResponseDto response = new OtpResponseDto("Otp generated successfully", otp);
        return ResponseEntity.ok(response);
    }
}
