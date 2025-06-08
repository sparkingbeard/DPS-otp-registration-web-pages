package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.PaymentTransaction;

public interface PaymentTransactionRepo extends JpaRepository<PaymentTransaction, Long> {
    
}
