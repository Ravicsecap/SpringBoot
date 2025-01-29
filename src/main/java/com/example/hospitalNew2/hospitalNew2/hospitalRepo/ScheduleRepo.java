package com.example.hospitalNew2.hospitalNew2.hospitalRepo;

import com.example.hospitalNew2.hospitalNew2.entity.Schedule;
import org.springframework.data.annotation.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepo extends JpaRepository<Schedule, Long> {
}
