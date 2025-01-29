package com.example.hospitalNew2.hospitalNew2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HospitalDTO {
    private Long id;
    private String hospitalName;
    private String shortCode;
    private String addressLine1;
    private String addressLine2;
    private Double lat;
    private Double lng;
    private LocalDateTime validity;
    private String hospitalType;
    private String clusterName;
    private Long createdBy;
    private Long updatedBy;

}
