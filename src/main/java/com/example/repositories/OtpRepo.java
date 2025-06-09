package com.example.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.OtpSession;

public interface OtpRepo extends JpaRepository<OtpSession, Long> {
    // It is not a SQL query but a custom Spring Data Jpa method name.
    Optional<OtpSession> findTopByMobileAndOtpOrderByGeneratedAtDesc(String mobile, String otp);
}
