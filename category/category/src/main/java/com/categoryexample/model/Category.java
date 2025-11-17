package com.categoryexample.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "employee")
@Setter
@Getter
public class Category {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name = "department")
    private String departmentName;

    @Column(name="roll")
    private String roll;

    @Column(name = "dob")
    private LocalDate dateOfBirth;

    @Column(name="doj")
    private LocalDate dateOfJoin;

    @Column(name="comment")
    private String comment;

}
