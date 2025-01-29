package com.example.hospitalNew2.hospitalNew2.hospitalRepo;

import com.example.hospitalNew2.hospitalNew2.entity.Hospital;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepo extends JpaRepository<Hospital , Long> {
}
