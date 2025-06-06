package com.example.model;

import com.example.Enum.PersonType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ParentStudentInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ManyToOne
    @JoinColumn(name = "registration_id")
    private Registration registration;
    private Long id;
    private String name;
    private String phone;
    private String relation;
    @Enumerated(EnumType.STRING)
    private PersonType  role;
}
