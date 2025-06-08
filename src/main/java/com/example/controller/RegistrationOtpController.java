package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.RegistrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/api")
public class RegistrationOtpController {

    @Autowired
    RegistrationService registrationOtpService;

    @PostMapping("/registration")
    public ResponseEntity<String> (@RequestParam String mobile) {
        
    }

}
