package com.example.hospitalNew2.hospitalNew2.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Table(name = "t_schedule")
public class Schedule implements Serializable {

    private static final long serialVersionUID = 5101522309714170984L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SCHEDULE_ID")
    private Long id;

    @ManyToOne(optional = false) // Enforce non-null constraint
    @JoinColumn(name = "BRANCH_ID", nullable = false)
    private Branch branch; // Assuming Branch is another entity

    @ManyToOne(optional = false) // Enforce non-null constraint
    @JoinColumn(name = "DEPARTMENT_ID", nullable = false)
    private Department department; // Assuming Department is another entity

//    @JsonManagedReference
//    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<TimeSlot> timeSlots;

    @Column(name = "created_by", nullable = false)
    private Long createdBy;

    @Column(name = "updated_by", nullable = false)
    private Long updatedBy;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

//    @Column(name = "is_active")
//    private Boolean isActive = true;

  }







