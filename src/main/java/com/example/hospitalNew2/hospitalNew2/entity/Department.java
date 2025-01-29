package com.example.hospitalNew2.hospitalNew2.entity;//package com.example.hospitalNew2.hospitalNew2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_department", schema="dbo")
public class Department implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEPARTMENT_ID")
    private Long departmentId;

    @Column(name = "DEPARTMENT_NAME", length = 100, nullable = false)
    private String departmentName;

    @Column(name = "department_code")
    private String departmentCode;


    @Column(name = "CATEGORY", length = 50)
    private String category;

    @Column(name = "IS_ACTIVE_DEPARTMENT", length = 50, unique = true, nullable = false)
    private Boolean isActiveDepartment = true;

    @CreationTimestamp
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Column(name = "CREATED_BY")
    private Long createdBy;

    @Column(name = "UPDATED_BY")
    private Long updatedBy;

    @ManyToOne // Assuming a department belongs to a branch
    @JoinColumn(name = "branch_id") // This links the branch foreign key
    private Branch branch;

}





