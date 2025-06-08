package com.example.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.model.OtpSession;

@Service
public class OtpSessionServiceImpl implements OtpSessionService {
    private String generateOtp() {
        Random random = new Random();
        int otp = random.nextInt(900000) + 100000;
        return String.valueOf(otp);
    }

    @Override
    public String createAndSendOtp(String mobile) {
        String otp = generateOtp();
        OtpSession session = new OtpSession();
        
    }
}
