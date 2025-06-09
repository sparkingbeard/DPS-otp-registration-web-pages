package com.example.controller;

import org.apache.catalina.connector.Response;
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

    @PostMapping("/otp-generate")
    public ResponseEntity<OtpResponseDto> otpGenerate(@RequestParam String mobile) {
       String otp = otpSessionService.createAndSendOtp(mobile);
       OtpResponseDto response = new OtpResponseDto("Otp generated successfully", otp);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/otp-verify")
    public ResponseEntity<String> otpVerify(String otp, String mobile){
        boolean isValid = otpSessionService.verifyOtp(otp, mobile);
        if(isValid){
            return ResponseEntity.ok("Otp verified successfully");
        }
        else{
            return ResponseEntity.ok("Invalid otp");
        }
    }
}
