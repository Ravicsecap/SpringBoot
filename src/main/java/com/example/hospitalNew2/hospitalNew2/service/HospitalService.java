package com.example.hospitalNew2.hospitalNew2.service;


import com.example.hospitalNew2.hospitalNew2.dto.*;
import com.example.hospitalNew2.hospitalNew2.entity.*;
import com.example.hospitalNew2.hospitalNew2.hospitalRepo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class HospitalService {

    @Autowired
    private HospitalRepo hospitalRepository;

    @Autowired
    private BranchRepo branchRepository;

    @Autowired
    private DepartmentRepo departmentRepository;

    @Autowired
    private DesigantionRepo designationRepository;

    @Autowired
    private ScheduleRepo scheduleRepository;

    @Autowired
    private EmployeeRepo employeeRepository;

//    @Autowired
//    private DatabaseCredentials databaseCredentials;
//
//    public DatabaseCredentials databaseService(DatabaseCredentials databaseCredentials) {
//        DatabaseCredentials databaseCredentials1 = new DatabaseCredentials();
//        databaseCredentials1.setUrl(databaseCredentials.getUrl());
//        databaseCredentials1.setPassword(databaseCredentials.getUsername());
//        databaseCredentials1.setUsername(databaseCredentials.getPassword());
//        return databaseCredentials1;
//    }


    public Hospital createHospital(HospitalDTO hospitalDTO) {
        Hospital hospital = new Hospital();
        hospital.setHospitalName(hospitalDTO.getHospitalName());
        hospital.setShortCode(hospitalDTO.getShortCode());
        hospital.setAddressLine1(hospitalDTO.getAddressLine1());
        hospital.setAddressLine2(hospitalDTO.getAddressLine2());
        hospital.setValidity(LocalDateTime.now());
        hospital.setCreatedBy(hospitalDTO.getCreatedBy());
        hospital.setUpdatedBy(hospitalDTO.getUpdatedBy());
        hospital.setHospitalType(hospitalDTO.getHospitalType());
        hospital.setCreatedAt(LocalDateTime.now());
        hospital.setUpdatedAt(LocalDateTime.now());
        hospital = hospitalRepository.save(hospital);
        return (hospital);
    }

    public Branch createBranch(BranchDTO branchDTO) {
        Optional<Hospital> hospitalOpt = hospitalRepository.findById(branchDTO.getHospitalId());
        if (!hospitalOpt.isPresent()) {
            throw new IllegalArgumentException("Invalid hospital ID");
        }
        Branch branch = new Branch();
        branch.setBranchName(branchDTO.getBranchName());
        branch.setBranchCode(branchDTO.getBranchCode());
        branch.setCreatedAt(LocalDateTime.now());
        branch.setHospital(hospitalOpt.get());
        branch = branchRepository.save(branch);
        return (branch);
    }

    public Department createDepartment(DepartmentDTO departmentDTO) {
        Optional<Branch> branchOpt = branchRepository.findById(departmentDTO.getBranchId());
        if (!branchOpt.isPresent()) {
            throw new IllegalArgumentException("Invalid branch ID");
        }
        Department department = new Department();
        department.setDepartmentName(departmentDTO.getDepartmentName());
        department.setDepartmentCode(departmentDTO.getDepartmentCode());
        department.setCategory(departmentDTO.getCategory());
        department.setIsActiveDepartment(true);
        department.setCreatedAt(LocalDateTime.now());
        department.setUpdatedAt(LocalDateTime.now());
        department.setCreatedBy(departmentDTO.getCreatedBy());
        department.setUpdatedBy(departmentDTO.getUpdatedBy());
        department.setBranch(branchOpt.get());
        department = departmentRepository.save(department);
        return (department);
    }

    public Designation createDesignation(DesignationDTO designationDTO) {
        Optional<Department> departmentOpt = departmentRepository.findById(designationDTO.getDepartmentId());
        if (!departmentOpt.isPresent()) {
            throw new IllegalArgumentException("Invalid department ID");
        }

        Optional<Branch> branchOpt = branchRepository.findById(designationDTO.getBranchId());
        if (!branchOpt.isPresent()) {
            throw new IllegalArgumentException("Invalid branch ID");
        }
        Designation designation = new Designation();
        designation.setName(designationDTO.getName());
        designation.setCode(designationDTO.getCode());
        designation.setLevel(designationDTO.getLevel());
        designation.setCreatedAt(LocalDateTime.now());
        designation.setUpdatedAtD(LocalDateTime.now());
        designation.setActive(true);
        designation.setCreatedBy(designationDTO.getCreatedBy());
        designation.setUpdatedBy(designationDTO.getUpdatedBy());
        designation.setDepartment(departmentOpt.get());
        designation.setBranch(branchOpt.get());

        designation = designationRepository.save(designation);
        return (designation);
    }

    public Schedule createSchedule(ScheduleDTO scheduleDTO) {
        Optional<Department> departmentOpt = departmentRepository.findById(scheduleDTO.getDepartmentId());
        if (!departmentOpt.isPresent()) {
            throw new IllegalArgumentException("Invalid department ID");
        }

        Optional<Branch> branchOpt = branchRepository.findById(scheduleDTO.getBranchId());
        if (!branchOpt.isPresent()) {
            throw new IllegalArgumentException("Invalid branch ID");
        }
        Schedule schedule = new Schedule();
        schedule.setCreatedAt(LocalDateTime.now());
        schedule.setUpdatedAt(LocalDateTime.now());
        schedule.setCreatedBy(scheduleDTO.getCreatedBy());
        schedule.setUpdatedBy(scheduleDTO.getUpdatedBy());
        schedule.setDepartment(departmentOpt.get());
        schedule.setBranch(branchOpt.get());
        schedule = scheduleRepository.save(schedule);
        return (schedule);
    }

    public Employee createEmployee(EmployeeDTO employeeDTO) {
        Optional<Branch> branchOpt = branchRepository.findById(employeeDTO.getBranchId());
        if (!branchOpt.isPresent()) {
            throw new IllegalArgumentException("Invalid branch ID");
        }
        Optional<Designation> designationOpt = designationRepository.findById(employeeDTO.getDesignationId());
        if (!designationOpt.isPresent()) {
            throw new IllegalArgumentException("Invalid branch ID");
        }
        Optional<Department> deprtOpt = departmentRepository.findById(employeeDTO.getDepartmentId());
        if (!deprtOpt.isPresent()) {
            throw new IllegalArgumentException("Invalid branch ID");
        }
        Employee employee = new Employee();
        employee.setEmpName(employeeDTO.getEmpName());
        employee.setBranch(branchOpt.get());
        employee.setDesignation(designationOpt.get());
        employee.setDepartment(deprtOpt.get());
        employee.setCreatedAt(LocalDateTime.now());
        employee = employeeRepository.save(employee);
        return (employee);
    }
}





