package com.example.service;

public interface OtpSessionService {
    public String createAndSendOtp(String mobile);
    public boolean verifyOtp(String otp, String mobile);
}
