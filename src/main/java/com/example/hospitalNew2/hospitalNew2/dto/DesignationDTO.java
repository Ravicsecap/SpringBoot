package com.example.hospitalNew2.hospitalNew2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DesignationDTO {

    private Long id;
    private String name;
    private String code;
    private Long level;
    private String role;
    private Long departmentId;
    private Long branchId;

    private Long createdBy;
    private Long updatedBy;

}
