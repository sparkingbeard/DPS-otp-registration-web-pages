package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.OtpSession;

public interface OtpRepo extends JpaRepository<OtpSession, Long> {

}
