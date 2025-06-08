package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Registration;

public interface RegistrationRepo extends JpaRepository<Registration, Long> {

}
