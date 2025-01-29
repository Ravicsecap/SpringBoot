package com.example.hospitalNew2.hospitalNew2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {
    private Long empId;
    private String empName;
    private String empCode;
    private Long branchId;
    private Long designationId;
    private Long departmentId;
    private String workZone;
    private String phoneNo;
    private String email;
    private String gender;
    private Long createdBy;
    private Long updatedBy;

}
