package com.example.laboratorio3.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@Getter
@Setter
@Entity
@Table(name = "employees")
public class Employees {


    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name="employee_id",nullable = false)
    private int id;

    @Column(name="first_name",nullable = true)
    private String firstName;

    @Column(name="last_name",nullable = true)
    private String lastName;

    @Column(name="email",nullable = true)
    private String email;

    @Column(name="phone_number",nullable = true)
    private String phoneNumber;

    @Column(name="hire_date",nullable = true)
    private String hireDate;

    @Column(name="job_id",nullable = true)
    private String jobId;

    @Column(name="salary",nullable = true)
    private Float salary;

    @Column(name="commission_pct",nullable = true)
    private Float Float;

    @Column(name="manager_id",nullable = true)
    private Integer managerId;

    @Column(name="department_id",nullable = true)
    private Integer departmentId;

}
