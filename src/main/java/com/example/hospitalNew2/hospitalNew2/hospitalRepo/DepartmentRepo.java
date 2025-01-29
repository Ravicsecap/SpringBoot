package com.example.hospitalNew2.hospitalNew2.hospitalRepo;

import com.example.hospitalNew2.hospitalNew2.entity.Department;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepo extends JpaRepository<Department , Long> {
}
