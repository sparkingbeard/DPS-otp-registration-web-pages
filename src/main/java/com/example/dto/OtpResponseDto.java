package com.example.dto;

public class OtpResponseDto {
    private String message;
    private String otp;
    
    //constructor
    public OtpResponseDto(String message, String otp) {
        this.message = message;
        this.otp = otp;
    }

    //getter and setter methods
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }

    public String getOtp(){
        return otp;
    }
    public void setOtp(String otp){
        this.otp = otp;
    }

}