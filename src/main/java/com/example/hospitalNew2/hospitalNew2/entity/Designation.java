package com.example.hospitalNew2.hospitalNew2.entity;//package com.example.hospitalNew2.hospitalNew2.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_designation", schema = "dbo")
public class Designation implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DESIGNATION_ID")
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "DEPARTMENT_ID", nullable = false)
    private Department department;

    @Column(name = "DESIGNATION_NAME", length = 100, nullable = false)
    private String name;

    @Column(name = "DESIGNATION_CODE", length = 50, nullable = true)
    private String code;

    @Column(name = "DESIGNATION_LEVEL", length = 50, nullable = false)
    private Long level;

    @Column(name = "CREATED_AT", nullable = true)
    private LocalDateTime createdAtD;

    @Column(name = "UPDATED_AT", nullable = false)
    private LocalDateTime updatedAtD;

    @Column(name = "ROLE", length = 20)
    private String role;

    @Column(name = "is_active")
    private boolean isActive = true;

    @Column(name = "CREATED_BY")
    private Long createdBy;

    @Column(name = "UPDATED_BY")
    private Long updatedBy;

    private LocalDateTime createdAt;



    @ManyToOne
    @JoinColumn(name = "branch_id", nullable = false)
    private Branch branch;



}
