package com.example.hospitalNew2.hospitalNew2.hospitalRepo;

import com.example.hospitalNew2.hospitalNew2.entity.Employee;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee , Long> {
}
