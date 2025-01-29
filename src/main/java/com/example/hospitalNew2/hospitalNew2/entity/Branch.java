package com.example.hospitalNew2.hospitalNew2.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "t_branch", schema = "dbo")
public class Branch implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BRANCH_ID")
    private Long id;

    @Column(name = "BRANCH_NAME")
    private String branchName;

    @Column(name = "BRANCH_CODE")
    private String branchCode;

    @ManyToOne()
    @JoinColumn(name = "BRANCH_HEAD_ID", referencedColumnName = "EMP_ID", nullable = true)
    @JsonIgnore
    private Employee branchHead;

    @Column(name = "BRANCH_HEAD_NAME")
    private String branchHeadName;

    @Column(name = "branch_type")
    private String branchType;


    @Column(name = "CREATED_AT")
//    @CreationTimestamp
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    // @UpdateTimestamp
    private LocalDateTime updatedAt;

    @Column(name = "CREATED_BY")
    private Long createdBy;

    @Column(name = "UPDATED_BY")
    private Long updatedBy;

    @Column(name = "IS_ACTIVE")
    private Integer isActive;

    @Column(name = "clustor_no")
    private String cluster;


    public boolean isActive() {
        return this.isActive != null && this.isActive == 1;
    }

    // Setter for boolean isActive
    public void setActive(boolean active) {
        this.isActive = active ? 1 : 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id); // Use only the primary key or a unique field
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Branch branch = (Branch) obj;
        return Objects.equals(this.id, branch.id); // Compare only by primary key

    }

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;



}

