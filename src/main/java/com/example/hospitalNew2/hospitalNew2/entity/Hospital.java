package com.example.hospitalNew2.hospitalNew2.entity;//package com.example.hospitalNew2.hospitalNew2.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "feeder_hospitals", schema = "dbo")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "hospital_name", nullable = false)
    private String hospitalName;

    @Column(name = "short_code", nullable = false)
    private String shortCode;


    @Column(name = "address_line1", nullable = false)
    private String addressLine1;

    @Column(name = "address_line2")
    private String addressLine2;

    @Column(name = "lat")
    private Double lat; // Optional

    @Column(name = "lng")
    private Double lng; // Optional

    @Column(name = "validity", nullable = false)
    private LocalDateTime validity;

    @Column(name = "created_by", nullable = false)
    private Long createdBy;  // Store user ID as Long

    @Column(name = "updated_by", nullable = false)
    private Long updatedBy;  // Store user ID as Long

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(name = "hospital_type", nullable = false)
    private String hospitalType;

//    @Column(name = "is_active", nullable = false)
//    private Boolean isActive;

    @Column(name = "cluster_name", nullable = true) // New field
    private String clusterName;



    @Override
    public String toString() {
        return "Hospital{" +
                "id=" + id +
                ", hospitalName='" + hospitalName + '\'' +
                ", shortCode='" + shortCode + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", lat=" + lat +
                ", lng=" + lng +
                ", validity=" + validity +
                ", createdBy=" + createdBy +
                ", updatedBy=" + updatedBy +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", hospitalType='" + hospitalType + '\'' +
//                ", isActive=" + isActive +
                ", clusterName='" + clusterName + '\'' +
                '}';

    }



}