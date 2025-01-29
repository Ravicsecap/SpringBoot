package com.example.hospitalNew2.hospitalNew2.controller;

import com.example.hospitalNew2.hospitalNew2.dto.*;
import com.example.hospitalNew2.hospitalNew2.entity.*;
import com.example.hospitalNew2.hospitalNew2.service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hospitalApi")
@CrossOrigin(origins = "http://localhost:3000")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;



    @PostMapping("/hospital")
    public ResponseEntity<Hospital> createHospital(@RequestBody HospitalDTO hospitalDTO) {
        Hospital createdHospital = hospitalService.createHospital(hospitalDTO);
        return ResponseEntity.ok(createdHospital);
    }

    @PostMapping("/branch")
    public ResponseEntity<Branch> createBranch(@RequestBody BranchDTO branchDTO) {
        Branch createdBranch = hospitalService.createBranch(branchDTO);
        return ResponseEntity.ok(createdBranch);
    }

    @PostMapping("/department")
    public ResponseEntity<Department> createDepartment(@RequestBody DepartmentDTO departmentDTO) {
        Department createdDepartment = hospitalService.createDepartment(departmentDTO);
        return ResponseEntity.ok(createdDepartment);
    }

    @PostMapping("/designation")
    public ResponseEntity<Designation> createDesignation(@RequestBody DesignationDTO designationDTO) {
        Designation createdDesignation = hospitalService.createDesignation(designationDTO);
        return ResponseEntity.ok(createdDesignation);
    }

    @PostMapping("/schedule")
    public ResponseEntity<Schedule> createSchedule(@RequestBody ScheduleDTO scheduleDTO) {
        Schedule createdSchedule = hospitalService.createSchedule(scheduleDTO);
        return ResponseEntity.ok(createdSchedule);
    }

    @PostMapping("/employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeDTO employeeDTO) {
        Employee createdEmployee = hospitalService.createEmployee(employeeDTO);
        return ResponseEntity.ok(createdEmployee);
    }

}
