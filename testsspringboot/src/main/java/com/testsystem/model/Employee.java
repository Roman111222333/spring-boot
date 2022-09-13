package com.testsystem.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.testsystem.enums.EmployeeStatus;
import io.swagger.annotations.Scope;

import javax.persistence.*;

/**
 * Created by roman.ali on 8/17/2022.
 */
@Entity

@Table (name = "employees")

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email",unique = true)
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "education")
    private String education;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private EmployeeStatus status;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    @JsonBackReference
    private Department department;

    public Employee() {

    }

    public Employee(String name, String email, String address, String education, EmployeeStatus status) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.education = education;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", education='" + education + '\'' +
                ", status=" + status +
                '}';
    }




    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getDepartment(String department) {
        return department;
    }
}
