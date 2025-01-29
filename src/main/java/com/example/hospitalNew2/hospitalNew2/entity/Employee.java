package com.example.hospitalNew2.hospitalNew2.entity;//package com.example.hospitalNew2.hospitalNew2.entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDateTime;
//import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "t_employee", schema = "dbo")
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMP_ID")
    private Long empId;

    @Column(name = "COMPANY_ID")
    private Long companyId;


    @Column(name = "EMP_CODE")
    private String empCode;

    @Column(name = "EMP_NAME")
    private String empName;

    @Column(name = "UID")
    private String uid;

    @Column(name = "ID_NO")
    private String idNo;

    @Column(name = "ORG_ID")
    private Long orgId;


    @Column(name = "UPPER_ID")
    private Long upperId;

    @Column(name = "REGION_ID")
    private Long regionId;

    @Column(name = "COUNTRY_ID")
    private Long countryId;

    @Column(name = "PROVINCE_ID")
    private Long provinceId;

    @Column(name = "CITY")
    private String city;

    @Column(name = "UPPER_NAME")
    private String upperName;

    @Column(name = "HIRE_DATE")
    private Date hireDate;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "BIRTHDAY")
    private Date birthday;

    @Column(name = "NATION")
    private String nation;

    @Column(name = "MARRIED")
    private Boolean married;

    @Column(name = "PHONE_NO")
    private String phoneNo;

    @Column(name = "MOBILE_NO")
    private String mobileNo;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "NATIVE_PLACE")
    private String nativePlace;

    @Column(name = "ZIP_CODE")
    private String zipCode;

    @Column(name = "IS_HISTORY")
    private Boolean isHistory;

    @Column(name = "IN_SERVICE")
    private Boolean inService;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "CREATED_BY")
    private Long createdBy;

    @Column(name = "CREATED_TIME")
    private LocalDateTime createdTime;

    @Column(name = "UPDATED_BY")
    private Long updatedBy;

    @Column(name = "UPDATED_TIME")
    private LocalDateTime updatedTime;

    @Column(name = "VERSION")
    private Long version;

    @Column(name = "NATIVE_LANGUAGE")
    private String nativeLanguage;

    @Column(name = "FOREIGN_LANGUAGES")
    private String foreignLanguages;

    @Column(name = "WORK_YEARS")
    private Integer workYears;

    @Column(name = "GRADUATE_SCHOOL")
    private String graduateSchool;

    @Column(name = "GRADUATE_TIME")
    private Date graduateTime;

    @Column(name = "HIGHEST_DEGREE")
    private String highestDegree;

    @Column(name = "IMG_URE")
    private String imgUre;

    @Column(name = "DEFAULT_TIME_SLOT_ID")
    private Long defaultTimeSlotId;

    @Column(name = "LEAVE_ON_DAYS")
    private String leaveOnDays;

    @Column(name = "STREET")
    private String street;

    @Column(name = "UNIT_NO")
    private String unitNumber;

    @Column(name = "alternateNumber")
    private String alternateNumber;

    @Column(name = "alternateEmail")
    private String alternateEmail;

    @Column(name = "emergencyContact1")
    private String emergencyContact1;

    @Column(name = "emergencyContact2")
    private String emergencyContact2;

    @Column(name = "emergencyContactname1")
    private String emergencyContactname1;


    @Column(name = "emergencyContactname2")
    private String emergencyContactname2;

    private LocalDateTime createdAt;





    @Transient
    @Column(name = "BRANCH_ID") // Ensure the column name matches your database schema
    private Long branchId;

    @Transient
    @Column(name = "BIOMETRIC_ID") // Ensure the column name matches your database schema
    private String biometricID;

    @Column(name = "WORKZONE") // This is the new column added
    private String workZone;

    @Column(name = "ethnicity") // New column
    private String ethnicity;


    @Override
    public int hashCode() {
        return Objects.hash(empId); // Use only primary key
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employee employee = (Employee) obj;
        return Objects.equals(empId, employee.empId); // Compare only primary key
    }


    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empCode='" + empCode + '\'' +
                ", upperId=" + upperId + // Include upperId for reference
                ", hireDate=" + hireDate +
                ", gender='" + gender + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                // Exclude complex relationships to avoid StackOverflowError
                '}';
    }


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "BRANCH_ID") // Add this line
    private Branch branch; // Add this field




    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "DESIGNATION_ID")
    private Designation designation;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "DEPARTMENT_ID")
    private Department department;






}
