package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.ParentStudentInfo;

public interface ParentStudentInfoRepo extends JpaRepository<ParentStudentInfo, Long> {

}
