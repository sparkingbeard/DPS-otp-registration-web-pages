package com.example.service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.OtpSession;
import com.example.repositories.OtpRepo;

@Service
public class OtpSessionServiceImpl implements OtpSessionService {

    @Autowired
    OtpRepo otpRepo;

    private String generateOtp() {
        Random random = new Random();
        int otp = random.nextInt(900000) + 100000;
        return String.valueOf(otp);
    }

    @Override
    public String createAndSendOtp(String mobile) {
        String otp = generateOtp();
        OtpSession session = new OtpSession();
        session.setMobile(mobile);
        session.setOtp(otp);
        session.setOtpCount(0);
        session.setGeneratedAt(LocalDateTime.now());

        otpRepo.save(session);
        System.out.println("the generated otp for:"+ mobile + "is " + otp);
        return otp;
    }

    @Override
    public boolean verifyOtp(String otp, String mobile) {
        // Optional is a java wrapper class which may or may not contain a value. It is used because it prevents NullPointeException if no data is found.
      Optional<OtpSession> otpSessionn = otpRepo.findTopByMobileAndOtpOrderByGeneratedAtDesc(mobile,otp);
      return otpSessionn.isPresent(); // Returns true if found, else false
    }
}
