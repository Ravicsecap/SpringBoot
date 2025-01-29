package com.example.hospitalNew2.hospitalNew2.dto;

import com.example.hospitalNew2.hospitalNew2.entity.Hospital;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BranchDTO {
    private Long id;
    private String branchName;
    private String branchCode;
    private Long hospitalId;
    private String branchType;
    private Long createdBy;
    private Long updatedBy;
    private Hospital hospital;


}
