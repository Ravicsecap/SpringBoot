package com.example.hospitalNew2.hospitalNew2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDTO {
    private Long departmentId;
    private String departmentName;
    private String departmentCode;

    private String category;
    private Boolean isActiveDepartment;
    private Long hospitalId;
    private Long branchId;
    private Long createdBy;
    private Long updatedBy;

}
