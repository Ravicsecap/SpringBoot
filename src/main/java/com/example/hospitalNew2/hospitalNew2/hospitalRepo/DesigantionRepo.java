package com.example.hospitalNew2.hospitalNew2.hospitalRepo;

import com.example.hospitalNew2.hospitalNew2.entity.Designation;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event;

public interface DesigantionRepo extends JpaRepository<Designation , Long> {
}
