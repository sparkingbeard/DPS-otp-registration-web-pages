package com.example.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class RegistrationOtpServiceImpl implements RegistrationOtpService {

    private void generateOtp(){
        Random random = new Random();
        random.nextInt()
    }

    @Override
    public String createAndSendOtp(String mobile) {
        String opt = generateOtp();

        otpSession session = new otpSession();

    }
      
}
